package Guru99cartPageTest;

import org.testng.annotations.Test;

public class guruPageTest extends BaseClass
{
	@Test(priority=1)
	public void testquantity()
	{
		gp.selectQuantity();
	}
  @Test(priority=2)
  public void selectdrop() 
  {
	gp.selectbutton();
  }
  
  @Test(priority=3)
  public void testCardNumber()
  {
	  gp.setCardnumber();
  }
  @Test(priority=4)
 public void testmonth()
 {
	  gp.setmonth();
 }
  @Test(priority=5)
  public void testyear()
  {
 	  gp.setyaer();
  }
  @Test(priority=6)
  public void testcod()
  {
 	  gp.setcod();
  }
  @Test(priority=7)
  public void testclick()
  {
 	  gp.clickbutton();
  }
  
  
  
  
  
  
}
