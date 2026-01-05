import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;


public class JavaScriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver =new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor JS = (JavascriptExecutor)driver;
		JS.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		JS.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		List<WebElement>Amount= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum=0;
		
		for(int i=0;i<Amount.size();i++)
		{
			
			sum= sum +Integer.parseInt(Amount.get(i).getText());
		}
		System.out.println("Total sum :" +sum);	
	}
}
