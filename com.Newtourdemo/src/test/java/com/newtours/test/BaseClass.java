package com.newtours.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	WebDriver driver;

	@Parameters({ "Browser" })
	@BeforeMethod
	public void Setup(@Optional("Firefox") String Browser) {
		if (Browser.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"D:\\Kishore\\Courses\\Selenium May2019\\WebDrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			

		}

		else if (Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"D:\\Kishore\\Courses\\Selenium May2019\\WebDrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://newtours.demoaut.com");
	}

	@AfterMethod
	public void close() {
		driver.close();
	}

}
