package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name ="rahul";
		System.setProperty("webdriver.chrome.driver","C:\\Users\\geeta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys("abc");
		driver.findElement(By.className("signInBtn")).click();
		String errormsg = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(errormsg);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		//Xpath by tagname--> //tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("geeta");
		//css by tagname---> tagname[attribute='value']
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("geeta@abc,com");
		//xpath by index---->/tagname[@attribute='value'][index]
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//css by index--->tagname[attribute='value']:nth-child(index)
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("test@abc.com");
		//xpath by child parent tags---> //parentTagname/childtagname
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9843113221");
		//css by classnamee---> .classname
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//CSS by child parent tags---> parentTagname childtagname
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		//Xpath by parent child traverse---> //Tagname[@attribute='value']/childtagname
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		//css by id and tagname---> tagname#id
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		//css by Regular expression---> tagname[attribute*='partialtext']
		driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		//Xpath by Regular expression---> tagname[contains(@attribute,'partialtext')]
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		//Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container']h2")).getText(),"Hello" +name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.close();
		
		
		
		

	}

	

}
