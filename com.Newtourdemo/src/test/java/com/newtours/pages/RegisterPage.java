package com.newtours.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage  {
	
	WebDriver driver;
	public RegisterPage(WebDriver driver)
	
	{
		this.driver=driver;
	}

	
	public void EnterUsername() {
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys("Gvkishore.kish@gmail.com");
		System.out.println("Entered username");

	}

	

	public void EnterPassword() {
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("Sisira123");
		System.out.println("Entered password");

	}
	
	
	public void ConfirmPassword()

	{
		WebElement Password = driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		Password.sendKeys("Sisira123");
		System.out.println("Entered confirmpassword");

	}
	
	public void ClickOnSubmitButton()
	{
		WebElement ClickOnSubmit = driver.findElement(By.xpath("//input[@name='register']"));
		ClickOnSubmit.click();
	}
	
	public void EnterRegistrationDetails()
	{
		EnterUsername();
		EnterPassword();
		ConfirmPassword();
		ClickOnSubmitButton();
	}
}
