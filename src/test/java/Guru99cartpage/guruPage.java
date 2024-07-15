package Guru99cartpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import help.Utility;

public class guruPage 
{
	private WebDriver driver;
	
	public guruPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	
	private By cardNumber=By.id("card_nmuber");
	private By month=By.id("month");
	private By year=By.id("year");
	private By cvvcode=By.id("cvv_code");
	private By clickbutton=By.name("submit");
	
	//Methods
	
	public void setCardnumber()
	{
		driver.findElement(cardNumber).sendKeys("1234567891234567");
		
	}
	public void setmonth()
	{
		WebElement  setmonth=driver.findElement(month);
		setmonth.click();
		Utility.selectBasedDropdown(setmonth, "12");
		
	}
	public  void setyaer()
	{
	WebElement setyear=	driver.findElement(year);
	setyear.click();
	Utility.selectBasedDropdown(setyear,"2028");
	}
	public void setcod()
	{
		driver.findElement(cvvcode).sendKeys("123456789");
		
	}
	public void clickbutton()
	{
		driver.findElement(clickbutton).click();
	}
	
	
	
	
	

}
