package POM;

import java.util.ArrayList;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import generics.BasePage;



public class HomePage extends BasePage{

	@FindBy(xpath="//a[.='Mobiles']")
	private WebElement mobiles;
	@FindBy(xpath="//a[.='All Mobile Phones']")
	private WebElement allMob;
	@FindBy(xpath="//a[@class='cart_ic']")
	private WebElement cart;
	@FindBy(xpath="//a[@class='notify_ic']")
	private WebElement notification;
	@FindBy(xpath="//ul[@id='4521']//a//img")
	private WebElement under4999;
	@FindBy(xpath="//a[.='Re-New Gadgets']")
	private WebElement reNewGadget;
	@FindBy(xpath="//a//strong[contains(.,'Feature phones ')]")
	private WebElement featurePhonet;
	@FindBy(xpath="//div//li[3]//a[.='Feature Phones']")
	private WebElement featurePhone;
	@FindBy(xpath="(//span[@class='slick-slide slick-active'])[3]")
	private WebElement ivoomiMob;
	@FindBy(xpath="(//a[.='Unboxed Mobiles']")
	private WebElement unBoxedPhone;
	@FindBy(xpath="//a[.='Refurbished Mobiles']")
	private WebElement refurbishedMob;
	@FindBy(xpath="//a[.='Under 999']")
	private WebElement under999;
	@FindBy(xpath="//li//li//a[.='Tablets']")
	private WebElement tablets;
	@FindBy(xpath="//a[.='Mobile Accessories']")
	private WebElement mobAccessories;
	@FindBy(xpath="//a[.='Memory Cards']")
	private WebElement memoryCard;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;

	}
	
	public void mousehover(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(mobiles).perform();
		
	}
	public void clkAllmob()
	{
		allMob.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
		
	}
	public void clkCart()
	{
		cart.click();
	}
	public void mouseHoverNoti(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(notification).perform();
	}
	public void clkUnder4999()
	{
		under4999.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void mouseHoverReNEwGad(WebDriver driver)
	{
		Actions a = new Actions(driver);
		a.moveToElement(reNewGadget).perform();
	}
	public void clkFeaturePhone()
	{
		featurePhonet.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkMOuseHovFeaturePhone()
	{
		featurePhone.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkIvoomiMob()
	{
		ivoomiMob.click();
	}
	public void clkunboxedPhone()
	{
		unBoxedPhone.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkRefMOb()
	{
		refurbishedMob.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
	}
	public void clkUnder999()
	{
		under999.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
	}
	public void clkTablests()
	{
		tablets.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
	}
	public void clkMobAcc()
	{
		mobAccessories.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));
		
		
		
	}
	public void clkMemoryCard()
	{
		memoryCard.click();
		ArrayList<String> whs = new ArrayList<String>(driver.getWindowHandles()) ;

		driver.switchTo().window(whs.get(1));

		
	}
	public void verifyEle()
	{
		verifyElement(driver, ETO, mobiles);
	}
	
	

}
