package introduction;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FilterJavaStreams {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		driver.findElement(By.linkText("Top Deals")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[type='search']")).sendKeys("Rice");
		List <WebElement> items = driver.findElements(By.xpath("//tr/td[1]"));
		
		List filterednewList= items.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());
	Assert.assertEquals(items.size(), filterednewList.size());
	
	
	}
	

}
