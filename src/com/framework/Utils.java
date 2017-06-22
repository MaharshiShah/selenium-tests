package com.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Utils {
	protected WebDriver driver;

	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "/Users/maharshishah/Documents/Testing/libs/geckodriver");
		System.setProperty("webdriver.chrome.driver", "/Users/maharshishah/Documents/Testing/libs/chromedriver");
		driver = new ChromeDriver();
	}

	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}
