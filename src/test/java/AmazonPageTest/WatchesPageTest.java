package AmazonPageTest;

import org.testng.annotations.Test;

public class WatchesPageTest extends BaseClass
{
  @Test(priority=1)
  public void testWatches() 
  {
	  wp.Scroll();
  }
@Test(priority=2)
public void testwatches()
{
	wp.selectwatches();
}


}

