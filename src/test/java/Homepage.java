package test.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Homepage {
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		System.setProperty("webdriver.gecko.driver",
				"/Users/maharshishah/Documents/Testing/libs/geckodriver");
		System.setProperty("webdriver.chrome.driver",
				"/Users/maharshishah/Documents/Testing/libs/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void getHomePage() {
		driver.get("http://automationpractice.com/");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
}