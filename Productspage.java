package inctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Productspage {
	
WebDriver driver;
Actions a;
	
	
	
	public Productspage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void clickonmenu() 
	{
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
	}
	
	public void clickonabout()

	{
		WebElement about = driver.findElement(By.xpath("(//a[@tabindex='0'])[2]"));
		about.click();
		
		 String actual = driver.getCurrentUrl();
	    String  expected = "https://saucelabs.com/";
		System.out.println(actual);
		System.out.println(expected);
		
		driver.navigate().back();
		
		WebElement price = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']/../div"));
		String highprice = price.getText();
		System.out.println(highprice);
		
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).click();
		driver.findElement(By.xpath("//div[@id='shopping_cart_container']")).click();
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		
		
		
		
		
		
		
	}
	
	

}
