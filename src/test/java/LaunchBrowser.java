import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{	public static void  main(String args[]) throws InterruptedException
	{
	
	//Launch Fire fox Browser
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver = new FirefoxDriver();
	
	//WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	
	
	//Open App
	driver.get("https://selenium-prd.firebaseapp.com/");

	//Maximize app window
	driver.manage().window().maximize();
	
	//Enter text in Email and Password text-boxes
	WebElement username=driver.findElement(By.id("email_field"));
	username.sendKeys("admin123@gmail.com");
	
	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");
	
	 //"Login to Account" Click
	driver.findElement(By.xpath("//*[text()='Login to Account']")).click();
	
	driver.findElement(By.xpath("//a[text()='Home']")).click();
	Thread.sleep(1000);
	
	//Radio button to select only one option in the 'Gender' field	
	//driver.findElement(By.xpath("//input[@value='female']")).click();
	
		//Select city (drop down)
	//WebElement selectCity=driver.findElement(By.xpath("//*[@id=\"city\"]"));
	//Select select=new Select(selectCity);
	//select.selectByValue("patna");

	
	
	
	}

}
