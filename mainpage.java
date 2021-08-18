package inctest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mainpage {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\File\\newchromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.get("https://www.saucedemo.com/");
		 Loginpage l = new Loginpage(driver);
		 l.eneterusername();
		 l.enterpassword();
		 l.clickonlogin();
		 
		 Productspage p = new Productspage(driver);
		 p.clickonmenu();
		 p.clickonabout();
		 
		Infopage info = new Infopage(driver);
		info.enterdetails();

	}

}
