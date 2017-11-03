package POM;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;

public class InovuI7Page extends BasePage {
	
	@FindBy(xpath="//button[@id='add_cart']")
	private WebElement addCart;
	@FindBy(xpath="//input[@id='zip']")
	private WebElement buy;
	@FindBy(id="5411357")
	private WebElement culBlue;
	@FindBy(id="5411359")
	private WebElement culBlack;
	@FindBy(id="5466513")
	private WebElement culGrey;
	@FindBy(id="zip")
	private WebElement pinCode;
	@FindBy(id="check_shipping")
	private WebElement chkPinCode;
	@FindBy(xpath="//a[.='Visit Seller Store']")
	private WebElement vstSellerStr;
	@FindBy(id="scrolltoreview")
	private WebElement review;
	public InovuI7Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkAddCart()
	{
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(addCart));
		addCart.click();
		
		
	}
	public void clkBuy()
	{	WebDriverWait wait = new WebDriverWait(driver, ETO);
	wait.until(ExpectedConditions.visibilityOf(buy));
		buy.click();
	}
	public void clkculBlue()
	{
		culBlue.click();
	}
	public void clkculBlack()
	{
		culBlack.click();
	}
	public void clkculGrey()
	{
		culGrey.click();
	}
	public void enterPinCode(String zip)
	{
		pinCode.sendKeys(zip);
	}
	public void clkcheck()
	{
		chkPinCode.click();
	}
	public void clkVisitSellerStore()
	{
		vstSellerStr.click();
	}
	public void clkReview()
	{
		review.click();
	}
	public void verifyEle()
	{
		verifyElement(driver, ETO, addCart);
	}
	
	

}
