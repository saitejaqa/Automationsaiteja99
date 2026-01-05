import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;



public class CalanderTest {

	public static void main(String[] args) {
		
		String monthnumber="6";
		String Date="15";
		String Year="2027";
		String[] expectedList = {monthnumber,Date,Year};
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		driver.findElement(By.xpath("//button[text()='"+Year+"']")).click();
		 List<WebElement> months =driver.findElements(By.cssSelector(".react-calendar__year-view__months button"));
	    months.get(Integer.parseInt(monthnumber) - 1).click();
		driver.findElement(By.xpath(" //abbr[text()='"+Date+"']")).click();
		Date=driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).getText();
		System.out.println("Date is :"+Date);
		
		
		List<WebElement>ActualLIST=driver.findElements(By.cssSelector(".react-date-picker__inputGroup_input"));
		
		for(int i=0; i<ActualLIST.size();i++) {
			System.out.println(ActualLIST.get(i).getAttribute("value"));
			//Assert.assertEquals(ActualLIST.get(i).getAttribute("value"), expectedList[i]);
		}
		//driver.close();
	}
}
