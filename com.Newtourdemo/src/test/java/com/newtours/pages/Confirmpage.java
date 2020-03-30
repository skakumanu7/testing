package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmpage {
	
	WebDriver driver;
	
	public Confirmpage(WebDriver TestNGdriver)
	{
		driver=TestNGdriver;
	}
	
	public void ConfirmReg()
	{
	WebElement confirmtext=	driver.findElement(By.xpath("//b[contains(text(),'Your user name is Gvkishore.kish@gmail.com.')]"));
	if(confirmtext.isDisplayed())
	{
		System.out.println("The registration process is successful");
	}
	else {
		System.out.println("The registration process is failed");
	}
	
	}
	

}
