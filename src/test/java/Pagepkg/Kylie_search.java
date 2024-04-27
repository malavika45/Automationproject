package Pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kylie_search {
	
		WebDriver driver;
		@FindBy(xpath="/html/body/header/div[2]/div[1]/div[4]/a[3]")
		WebElement kyliesearchitem;
		
		public 	Kylie_search(WebDriver driver)
		{
			this.driver= driver;
			PageFactory.initElements(driver, this);
		}
		public void getsearchitem() throws InterruptedException
		{
			//searchicon
			WebElement searchicon = driver.findElement(By.xpath("//*[@id=\"SearchForm-Header-Query\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchicon);

			//searchiteam
			Thread.sleep(4000);
			kyliesearchitem.sendKeys("fragrance");

			//searchbutton
			WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"SearchForm-Header-Submit\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchbutton);

		}
		public void addwishlist()
		{
			//firstsearchitem
			WebElement fsrchitem = driver.findElement(By.xpath("//*[@id=\"shopify-section-template--17292964757746__main\"]/article/div/div[2]/div[1]/article[2]/div[1]/a/div/div[1]/img"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", fsrchitem);
			//addbag
			WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"ProductForm-form-Add\"]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", addtocart);
			
			//viewcart
			WebElement viewcart = driver.findElement(By.xpath("/html/body/header/div[2]/div[1]/div[4]/div/a[2]"));
			((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewcart);
			
		}
}
