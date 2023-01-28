package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTestSiteSelenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String productName="Sauce Labs Onesie";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.name("login-button")).click();
		List <WebElement> products=driver.findElements(By.xpath("//button[contains(@id,'add-to-cart-')]"));
		WebElement prod=products.stream().filter(s->s.findElement(By.cssSelector(".inventory_item_name"))
				.getText().equals(productName)).findFirst().orElse(null);
		System.out.println(prod);
		//prod.findElement(By.xpath("//button[contains(@id,'add-to-cart-')]")).click();
		
		
		//driver.close();

	}

}
