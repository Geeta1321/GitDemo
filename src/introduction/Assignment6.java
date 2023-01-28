package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		String checkBoxText = driver.findElement(By.cssSelector("label[for='bmw']")).getText();
		System.out.println(checkBoxText);
		WebElement Staticdropdown = driver.findElement(By.id("dropdown-class-example"));
		Select sel = new Select(Staticdropdown);
		sel.selectByVisibleText(checkBoxText);
		driver.findElement(By.xpath("//input[@placeholder='Enter Your Name']")).sendKeys(checkBoxText);
		driver.findElement(By.id("alertbtn")).click();
		String alerttextObtained = driver.switchTo().alert().getText();
		Assert.assertEquals(alerttextObtained,
				"Hello " + checkBoxText + ", share this practice page and share your knowledge");
		driver.switchTo().alert().accept();

	}

}
