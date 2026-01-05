import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Windowhandles {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("[class='blinkingText']")).click();
		Set<String> windows=driver.getWindowHandles();   //[parent ID,CHILD ID]
		Iterator<String> it=windows.iterator();
		String Parentwindow=it.next();
		String ChildWindow=it.next();
		driver.switchTo().window(ChildWindow);
		String Text=driver.findElement(By.cssSelector("[class='im-para red']")).getText().split("at")[1].trim().split(" ")[0];
		//String Text=driver.findElement(By.cssSelector("[class='im-para red']")).getText();
		System.out.println("The Text is :" +Text);
		driver.switchTo().window(Parentwindow);
		driver.findElement(By.id("username")).sendKeys(Text);
		
		//driver.close();
	}
}
