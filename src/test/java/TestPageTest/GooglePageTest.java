package TestPageTest;

import org.testng.annotations.Test;

public class GooglePageTest extends BaseClass
{
  @Test(priority=1)
  public void test() 
  {
	 gp.Search();
	  
  }
  
  @Test(priority=2)
  public void element()
  {
	  gp.element();
  }
@Test(priority=3)
public void scrollpoint()
{
	gp.scroll();
}





}
