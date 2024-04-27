package Pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kylie_pageclass {
WebDriver driver;
	
   // @FindBy(xpath="//*[@id=\"MainContent\"]/article/div/div[2]/a") 
   // WebElement create_account;
    
	@FindBy(xpath="//*[@id=\"CustomerLogin-CustomerEmail\"]")
	WebElement kyc_email;
	
	@FindBy(xpath="//*[@id=\"CustomerLogin-CustomerPassword\"]")
	WebElement kyc_password;
						
	@FindBy(xpath="//*[@id=\"CustomerLogin-Submit\"]")
	WebElement kyc_loginbutton;
	
	public 	Kylie_pageclass(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void usernameClick() throws InterruptedException
	{
		Thread.sleep(4000);
		kyc_email.sendKeys("malavikaaji2001@gmail.com");
	}
	public void password_enter() throws InterruptedException {
		Thread.sleep(4000);
	    kyc_password.sendKeys("manavika");
	}
	public void loginButton() throws InterruptedException
	{
		Thread.sleep(4000);
		kyc_loginbutton.click();
	}
	public void setValues(String Username,String Pwd)  
	{
		
		kyc_email.sendKeys(Username);
		kyc_password.sendKeys(Pwd);
		
	}   
		
	}

