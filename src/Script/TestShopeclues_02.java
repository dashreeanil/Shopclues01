package Script;




import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.FeaturePhonePage;
import POM.HomePage;
import POM.InovuI7Page;
import generics.BaseTest;
import generics.CustomListner;


@Listeners(CustomListner.class)
public class TestShopeclues_02 extends BaseTest {

	@Test
	public void BuyFeaturePhone()
	
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkFeaturePhone();
		FeaturePhonePage p = new FeaturePhonePage(driver);
		p.enterContextInScrBar("InovuI7");
		p.clkinovui7Mob();
		InovuI7Page i = new InovuI7Page(driver);
		
		i.clkculBlack();
		i.enterPinCode("560014");
		i.clkcheck();
		i.clkAddCart();
		
		
	}

}

