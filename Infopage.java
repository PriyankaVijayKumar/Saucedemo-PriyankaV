package inctest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Infopage {

	
	WebDriver driver;
	Actions a;
		
		
		
		public Infopage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		public void enterdetails() 
		{
			WebElement firstname = driver.findElement(By.xpath("//input[@id='first-name']"));
			firstname.sendKeys("Priyanka");
			
			WebElement lastname = driver.findElement(By.xpath("//input[@id='last-name']"));
			lastname.sendKeys("V");
			
			WebElement zipcode = driver.findElement(By.xpath("//input[@id='postal-code']"));
			zipcode.sendKeys("560016");
			
			WebElement button = driver.findElement(By.xpath("//input[@id='continue']"));
			button.click();
		}
		
}
