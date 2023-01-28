package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class SelIntroduction {

	public static void main(String[] args) {
		
		//Step 1.invoking the browser
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C://Users//geeta//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\geeta\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.edge.driver","C:\\Users\\geeta\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//WebDriver driver = new EdgeDriver();
		driver.get("https://outlook.live.com/owa/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		System.out.println("Test case passed");
		

	}

}
