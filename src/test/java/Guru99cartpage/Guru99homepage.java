package Guru99cartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import help.Utility;

public class Guru99homepage 
{
	private WebDriver driver;
	
	public Guru99homepage (WebDriver driver)
	{
		this.driver=driver;
		
	}
	//locators
	private By quantity=By.xpath("//select[@name='quantity']");
	private By slectButton=By.xpath("//input[@value='Buy Now']");
	

	//methodes
	public void selectQuantity()
	{
		WebElement qua=driver.findElement(quantity);
		qua.click();
		Utility.selectBasedDropdown(qua,"9");
	}
	
	public void selectbutton()
	{
		driver.findElement(slectButton).click();
	}
	
}
