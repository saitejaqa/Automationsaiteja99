import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Scope {

	public static void main(String[] args) {
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector(".a-button-text")).click();
		int Countlinks=driver.findElements(By.tagName("a")).size();
		System.out.println("Amazon count in links is :"+Countlinks);
		//driver.close();
		

	}

}
