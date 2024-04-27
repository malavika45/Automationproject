package Testpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Basepkg.KylieCosmetics_info;
import Pagepkg.Kylie_pageclass;
import Pagepkg.Kylie_purchase;
import Pagepkg.Kylie_search;
import utilits.Kylie_utilies;

public class Kylie_testclass extends KylieCosmetics_info {
	@Test(priority=1)
	public void verifyLoginWithValidCred () throws Exception
	{
			Kylie_pageclass k1 = new Kylie_pageclass(driver);
		String x1 ="C:\\Users\\DELL\\Documents";
		String Sheet = "Sheet1";
		int rowCount = Kylie_utilies.getRowCount(x1, Sheet);
		for(int i=1;i<=rowCount;i++)
	{
			String Username =Kylie_utilies.getStringCellValue(x1, Sheet, i, 0);
			System.out.println("username------"+Username);
			
			String Pwd =Kylie_utilies.getStringCellValue(x1, Sheet, i, 1);
			System.out.println("password------"+Pwd);
			k1.usernameClick();
			k1.password_enter();
		driver.findElement(By.xpath("//*[@id=\"CustomerLogin-CustomerEmail\"]")).clear();		
		k1.setValues(Username,Pwd);
			k1.loginButton();
			driver.navigate().refresh();
			
			String expectedurl = "https://kyliecosmetics.com/en-in/account/login";
			String actualurl = driver.getCurrentUrl();
			if(actualurl.equals(expectedurl))
			{
				System.out.println("pass");
			}
	else
		{
				System.out.println("fail");
			}
			
		}
	}
	@Test(priority=2)
	public void verifyItemToBag() throws InterruptedException ,IOException
	{
		Kylie_purchase k2 = new Kylie_purchase (driver);
		k2.addressEnter();
		k2.addtocartClick();
		k2.apartmentEnter();
		k2.babyClick();
		k2.checkoutClick();
		k2.cityEnter();
		k2.dropdownClick();
		k2.lotionClick();
		k2.numberEnter();
		k2.pincodeEnter();
		k2.shippingClick();
		k2.stateClick();
		
		
	}
	@Test(priority=3)
	public void verifySearchItem() throws InterruptedException 
	{
		Kylie_search k3 = new Kylie_search(driver);
		k3.addwishlist();
		k3.getsearchitem();
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
