package com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	private static WebElement element = null;
	
	public static WebElement ContactUsLink(WebDriver driver) {
		element = driver.findElement(By.id("contact-link"));
		return element;
	}
	
	public static WebElement SignInLink(WebDriver driver) {
		element = driver.findElement(By.className("login"));
		return element;
	}
	
	public static WebElement CartLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a[title=\"View my shopping cart\"]"));
		return element;
	}
}