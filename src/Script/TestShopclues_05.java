package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.MobileAccPage;
import generics.BaseTest;
import generics.CustomListner;
@Listeners(CustomListner.class)
public class TestShopclues_05 extends BaseTest{
	@Test
	public void BuyMemoryCard()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkMobAcc();
		MobileAccPage m= new MobileAccPage(driver);
		m.clkcoverCase();
		
	}
}
