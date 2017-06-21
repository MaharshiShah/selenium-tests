package com.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homepage {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver",
				"/Users/maharshishah/Documents/Testing/libs/geckodriver");
		System.setProperty("webdriver.chrome.driver",
				"/Users/maharshishah/Documents/Testing/libs/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.quit();
	}
}