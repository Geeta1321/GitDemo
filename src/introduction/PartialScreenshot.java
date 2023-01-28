package introduction;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class PartialScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.switchTo().newWindow(WindowType.TAB); //--- open in new tab
		//driver.switchTo().newWindow(WindowType.WINDOW); --- open in new window
		Set<String> windowIds= driver.getWindowHandles();
		Iterator<String> it =windowIds.iterator();
		String ParentId= it.next();
		String ChildId = it.next();
		driver.switchTo().window(ChildId);
		driver.get("https://rahulshettyacademy.com/");
		String coursename=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(ParentId);
		WebElement nameEditbox=driver.findElement(By.name("name"));
		nameEditbox.sendKeys(coursename);	
		File screenshotFile =nameEditbox.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshotFile, new File("image.png"));
		
	}

}
