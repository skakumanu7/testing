package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage   {
 
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void ClickOnRegisterLink() throws InterruptedException 
	{
		Thread.sleep(5000);
	WebElement registerlink= driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]"));
	registerlink.click();
	System.out.println("Clicked on Register link");
		
	}

}
