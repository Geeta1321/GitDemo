package introduction;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverScope {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		// 1.print the count of links available on this page
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2. print the count of links on the footer section
		WebElement footerDriver = driver.findElement(By.id("gf-BIG"));// limiting webdriver scope
		System.out.println(footerDriver.findElements(By.tagName("a")).size());

		// 3.count of first column links on the footer section
		WebElement firstColumnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(firstColumnDriver.findElements(By.tagName("a")).size());
		
		//4. Click on each link of the 1st column if its opened or not and get the page title
		for (int i=1; i <firstColumnDriver.findElements(By.tagName("a")).size();i++) {
			String clickToLink= Keys.chord(Keys.CONTROL,Keys.ENTER);
			firstColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickToLink);
			
		}
		
		Set<String> win=driver.getWindowHandles();
		Iterator<String> it= win.iterator();
		
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	}
	

}
