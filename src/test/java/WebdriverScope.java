import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebdriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerdriver=driver.findElement(By.xpath("//div[@class=' footer_top_agile_w3ls gffoot footer_style']"));
		int SIZE=footerdriver.findElements(By.tagName("a")).size();
		System.out.println("Size :" +SIZE);
		WebElement Columndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		int SIZE2=Columndriver.findElements(By.tagName("a")).size();
		System.out.println("Size2 :" +SIZE2);
		for(int i=1;i<SIZE2;i++) 
		{
			String KEYS=Keys.chord(Keys.CONTROL,Keys.ENTER);
			Columndriver.findElements(By.tagName("a")).get(i).sendKeys(KEYS);
			Thread.sleep(5000L);
		}
			Set<String>windows=driver.getWindowHandles();
			Iterator<String>it=windows.iterator();
			while(it.hasNext()) 
			{
				driver.switchTo().window(it.next());
				String Title=driver.getTitle();
				System.out.println("Title :" +Title);
			}
			driver.close();
		}		
	}


