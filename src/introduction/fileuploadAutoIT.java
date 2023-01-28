package introduction;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileuploadAutoIT {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://convertpdftoword.com/");
		driver.findElement(By.cssSelector(".choose_button_text")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\geeta\\OneDrive\\Documents\\Autoitdocs\\fileupload.exe");
		
		
		
	}

}
