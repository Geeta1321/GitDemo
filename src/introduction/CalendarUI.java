package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarUI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");  
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("June");
		
		while(!driver.findElement(By.cssSelector(".flatpickr-current-month")).getText().contains("June"))
		{
		driver.findElement(By.cssSelector(".flatpickr-next-month")).click();	
		
		}
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();
		List<WebElement> dates= driver.findElements(By.cssSelector(".flatpickr-day "));
		int count = driver.findElements(By.cssSelector(".flatpickr-day ")).size();
		for(int i=0; i<count; i++)
		{
			String text =driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".flatpickr-day ")).get(i).click();
				break;
			}
		}
		
	}

}
