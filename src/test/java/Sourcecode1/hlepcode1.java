package Sourcecode1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class hlepcode1 
{
	public static void getScreenshot(WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
	File temp=	ts.getScreenshotAs(OutputType.FILE);
		 
	File dest=new File("./"+"sss//vv"+System.currentTimeMillis()+"png");
	
	try
	{
		FileHandler.copy(temp, dest);
		
	}catch(IOException e)
	
	{
		e.printStackTrace();
	}
	
	
	}

}