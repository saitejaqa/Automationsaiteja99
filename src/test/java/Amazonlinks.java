import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonlinks {

	public static void main(String[] args) {
		
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> links= driver.findElements(By.tagName("a"));
		//int i=links.size();
		System.out.println("Total Links: "+ links.size());
		
		for(int i=0;i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			System.out.println(links.get(i).getAttribute("herf"));
			
		}
		//System.out.println(driver.getTitle());
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.xpath("//a[@id=\"nav-logo-sprites\"]"));
		//driver.close();
	}
}
