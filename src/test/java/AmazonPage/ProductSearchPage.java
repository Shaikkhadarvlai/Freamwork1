package AmazonPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSearchPage
{
	private WebDriver driver;
	
	
	public ProductSearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	
	//Locators+Private
	private By slectOption=By.xpath("//select[@id='searchDropdownBox']");
	private By searchoption=By.xpath("//input[@id='twotabsearchtextbox']");
	
	
	
	
	
	
	
	
	
	//Methods+public 
	public void getOption()
	{
	List  <WebElement> option=driver.findElements(slectOption);
		System.out.println("Total Options are:"+option.size());
		for(WebElement i:option)
		{
			
			System.out.println(i.getText());
			if(i.getText().contains("Wacthes"))
			{
				i.click();
				break;
			}
		}	  
	 
	}
	
	public void getsearch()
	{
		driver.findElement(searchoption).sendKeys("Watches",Keys.ENTER);
	}
	public String geturl()
	{
	 return	driver.getCurrentUrl();
	}
	
	
	
	
	

}
