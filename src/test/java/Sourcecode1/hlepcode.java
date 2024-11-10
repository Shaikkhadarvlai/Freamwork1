package Sourcecode1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class hlepcode 
{
	
	public static void getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		  File temp=ts.getScreenshotAs(OutputType.FILE);
		  
		  //location
		  File dest=new File("./"+"\\short\\gurushoping"+System.currentTimeMillis()+".png");
		  
		  try 
		  {
				FileHandler.copy(temp, dest);
			} catch (IOException e) 
		  {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	

	
	}
}
