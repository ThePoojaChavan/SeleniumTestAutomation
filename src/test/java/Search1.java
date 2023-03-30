import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Search {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub\\
		WebDriverManager .chromedriver().setup();
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.manage().window().maximize();
		
		
		//WebElement search=driver.findElement(By.name("q"));
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("selenium testing");
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//*[text(),contains,'Xpath']"));
		
		//xpath code by Deekshith		
		//div[contains(@class,'wM6W7d') and contains(@role,'presentation')]
		
		for(WebElement element:list)
		{
			System.out.println(element.getText());
		}
		
		//Thread.sleep(2000);
		driver.close();
		
		

		
		
		
		

	}

}
