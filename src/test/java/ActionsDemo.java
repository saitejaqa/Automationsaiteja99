import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) throws InterruptedException {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions a= new Actions(driver);
		//a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
		WebElement move=driver.findElement(By.xpath("//input[@type='text']"));
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).
		click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		a.moveToElement(move).contextClick().build().perform();
		Thread.sleep(2000);
		driver.close();
		//driver.findElement(By.id("nav-link-accountList"));
	}
}
