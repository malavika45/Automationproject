package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kylie_purchase {
WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"Linklist-main-menu\"]/ul/li[4]/a") 
    WebElement ky_baby;
    
	@FindBy(xpath="//*[@id=\"shopify-section-template--17689330548978__main\"]/article/div/div[4]/div[1]/article[3]/div[1]/a/div/div[2]/img")
	WebElement ky_moisturizinglotion;
	
	@FindBy(xpath="//*[@id=\"ProductForm-form-Add\"]")
	WebElement ky_addtocart;
		
	@FindBy(xpath="//*[@id=\"MiniCart-Checkout\"]")
	WebElement ky_checkout;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_id\"]")
	WebElement ky_drpdwn;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_address1\"]")
	WebElement ky_address;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_address2\"]")
	WebElement ky_apartment;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_city\"]")
	WebElement ky_city;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_province\"]")
	WebElement ky_state;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_zip\"]")
	WebElement ky_pincode;
	
	@FindBy(xpath="//*[@id=\"checkout_shipping_address_phone\"]")
	WebElement ky_phnumber;
	
	@FindBy(xpath="//*[@id=\"continue_button_1\"]")
	WebElement ky_shipping;
	
	
	
	public 	Kylie_purchase(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void babyClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_baby.click();
	}
	
	public void lotionClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_moisturizinglotion.click();
	}
	public void addtocartClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_addtocart.click();
	}
	public void checkoutClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_checkout.click();
	}
	public void dropdownClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_drpdwn.click();
	}
	public void addressEnter() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_address.sendKeys("Thottumkal House");
	}
	public void apartmentEnter() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_apartment.sendKeys("asfdf");
	}
	public void cityEnter() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_apartment.sendKeys("perunad");
	}
	public void stateClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_state.click();
	}
	public void pincodeEnter() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_pincode.sendKeys("689711");
	}
	public void numberEnter() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_phnumber.sendKeys("6737738718");
	}
	public void shippingClick() throws InterruptedException
	{
		Thread.sleep(4000);
		ky_shipping.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	

	
	
	
	