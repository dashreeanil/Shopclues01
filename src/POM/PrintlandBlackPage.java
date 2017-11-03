package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;

public class PrintlandBlackPage extends BasePage {
	@FindBy(id="add_cart")
	private WebElement addCart;
	@FindBy(id="buy")
	private WebElement buy;
	@FindBy(id="5411357")
	
	private WebElement pinCode;
	@FindBy(id="check_shipping")
	private WebElement chkPinCode;
	@FindBy(xpath="//a[.='Visit Seller Store']")
	private WebElement vstSellerStr;
	
	public PrintlandBlackPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	public void clkAddCart()
	{
		addCart.click();
	
		
		WebDriverWait wait = new WebDriverWait(driver, ETO);
		wait.until(ExpectedConditions.visibilityOf(addCart));
	}
	public void clkBuy()
	{
		buy.click();
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
	public void verifyEle()
	{
		verifyElement(driver, ETO, addCart);
	}

}
