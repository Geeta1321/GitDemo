package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximizing the window
		driver.get("https://rahulshettyacademy.com/dropdownsPractise//");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(2000);
		List<WebElement> Options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement Option : Options) {
			if(Option.getText().equalsIgnoreCase("India")) {
				Option.click();
				break;
				
			}
		}
		System.out.println("DOne");
	}

}
