package Script;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.IvoomiPage;
import POM.MobilesPage;
import generics.BaseTest;
import generics.CustomListner;
 
 
@Listeners(CustomListner.class)
public class TestShopesclues_01 extends BaseTest {
	@Test(priority=1)
	public void BuyPhone()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkAllmob();
		h.verifyEle();
		MobilesPage m= new MobilesPage(driver);
		m.clkIvoomiMob();
		m.verifyEle();
		IvoomiPage i = new IvoomiPage(driver);
		i.clkGold();
		i.clkBuy();
		i.verifyEle();
	}
	

}
 