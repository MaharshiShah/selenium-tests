package test.java;

import org.testng.annotations.Test;

import com.framework.Utils;
import com.pageObjects.HomePage;

public class Homepage_Tests extends Utils {
	@Test
	public void getHomePage() throws InterruptedException {
		driver.get("http://automationpractice.com/");
		HomePage.ContactUsLink(driver).isDisplayed();
		HomePage.ContactUsLink(driver).click();
		driver.get("http://automationpractice.com/");
		HomePage.SignInLink(driver).isDisplayed();
		HomePage.SignInLink(driver).click();
		driver.get("http://automationpractice.com/");
		HomePage.CartLink(driver).isDisplayed();
		HomePage.CartLink(driver).click();
	}
}