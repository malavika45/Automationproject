package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class KylieCosmetics_info {
	public WebDriver driver;
	@BeforeTest
	public void setup() throws InterruptedException
	{
		
		driver=new ChromeDriver();
		driver.get("https://kyliecosmetics.com/en-in/account/login");
		driver.manage().window().maximize();
		

	}
}
