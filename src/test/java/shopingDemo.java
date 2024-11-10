import javax.xml.datatype.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Sourcecode1.hlepcode;
import help.Utility;

public class shopingDemo
{
	WebDriver driver;
	
	@Test(priority=1)
	public void applicationtest()
	{
		
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/payment-gateway/index.php");
		
		WebElement quality=driver.findElement(By.xpath("//select[@name='quantity']"));
		Utility.selectBasedDropdown(quality,"9");
		
		hlepcode.getScreenshot(driver);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	
	}
	@Test(priority=2)
	public void payment()
	{
		//Pay Ammount option
		
				hlepcode.getScreenshot(driver);
				
				driver.findElement(By.xpath("//input[@id='card_nmuber']")).sendKeys("1234567891234567");
				
				WebElement mont=driver.findElement(By.xpath("//select[@id='month']"));
				Utility.selectBasedDropdown(mont,"12");
				
				
				WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
				Utility.selectBasedDropdown(year,"2028");
				
				
				driver.findElement(By.xpath("//input[@id='cvv_code']")).sendKeys("123");
				
				driver.findElement(By.xpath("//input[@name='submit']")).click();
				hlepcode.getScreenshot(driver);
			
	}

}
