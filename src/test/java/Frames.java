import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {
	//@Test

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		int FramesCount=driver.findElements(By.tagName("iframe")).size();
		System.out.println("The Count of Frames in an Webpage is:" +FramesCount);
		driver.switchTo().frame(0);
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions a=new Actions(driver);
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Target=driver.findElement(By.id("droppable"));
		a.dragAndDrop(Source, Target).build().perform();
		driver.switchTo().defaultContent();
		driver.close();	
	}
}
