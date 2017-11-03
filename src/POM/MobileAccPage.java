package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generics.BasePage;

public class MobileAccPage extends BasePage {
	@FindBy(xpath="//ul[@class='lstShopByCategory']//li[1]//span[1]//a//img")
	private WebElement coverCase;
	public MobileAccPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	
	}
	public void clkcoverCase()
	{
		coverCase.click();
	}
	public void verifyEle()
	{
		verifyElement(driver, ETO, coverCase);
	}

}
