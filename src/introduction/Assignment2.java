package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("Geeta");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("abcd1234");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement Staticdropdown =driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown = new Select(Staticdropdown);
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath("//input[@value='option2']")).click();
		driver.findElement(By.name("bday")).sendKeys("01-01-2000");
		driver.findElement(By.className("btn-success")).click();
		System.out.println(driver.findElement(By.className("alert-dismissible")).getText());
		
		driver.close();
		System.out.println("Test Ran Succesfully");
		System.out.println("Test completed and job done");
		System.out.println("Execution completed");
		System.out.println("Again doing some changes---testing Git and Git hub");
		
		
		
		
	}

}
