package AmazonPageTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductSearchPageTest extends BaseClass
{
  @Test(priority=1)
  public void testsearch() 
  {
	  
	  pp.getOption();
  }
  @Test(priority=2)
  public void Testsearch()
  {
	  pp.getsearch();
  }
  @Test(priority=3)
  public void testurl()
  {
	String url=  pp.geturl();
    Assert.assertTrue(url.contains("Watches"),"url is not matched");
    System.out.println("url is matched"+url);
  
  }
}
