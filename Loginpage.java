package inctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	WebDriver driver;
	
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void eneterusername() 
	{
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	}
	public void enterpassword()
	{
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	}
	public void clickonlogin()
	{
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	

}
