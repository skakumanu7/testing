package com.newtours.test;

import org.testng.annotations.Test;

import com.newtours.pages.Confirmpage;
import com.newtours.pages.HomePage;
import com.newtours.pages.RegisterPage;

public class RegisterProcess extends BaseClass {
	@Test
	public void register() throws InterruptedException
	
	{
		HomePage hpage=new HomePage(driver);
		hpage.ClickOnRegisterLink();
		
		RegisterPage rpage=new RegisterPage(driver);
		rpage.EnterRegistrationDetails();
		
		Confirmpage cpage=new Confirmpage(driver);
		cpage.ConfirmReg();
		
		
	}

}
