package Guru99cartPageTest;

import org.testng.annotations.Test;

public class Guru99homepageTest extends BaseClass
{

	@Test(priority=1)
	public void testquantity()
	{
		hp.selectQuantity();
	}
  @Test(priority=2)
  public void selectdrop() 
  {
	hp.selectbutton();
  }

  
  
  
  }

