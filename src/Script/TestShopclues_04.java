package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.MemoryCardPage;
import POM.SamsungEVOPage;
import generics.BaseTest;
import generics.CustomListner;

@Listeners(CustomListner.class)

public class TestShopclues_04 extends BaseTest {
	@Test
	public void BuyMemoryCard()
	{
		HomePage h= new HomePage(driver);
		h.mousehover(driver);
		h.clkMemoryCard();
		
		MemoryCardPage p= new MemoryCardPage(driver);
		p.clkSamEv();
		p.verifyEle();
		
		SamsungEVOPage s= new SamsungEVOPage(driver);
		s.enterPinCode("560014");
		s.clkcheck();
		s.clkAddCart();
		
		
		
	}

}
