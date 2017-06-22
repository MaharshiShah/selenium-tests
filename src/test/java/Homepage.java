package test.java;

import org.testng.annotations.Test;

import com.framework.Utils;

public class Homepage extends Utils {
	@Test
	public void getHomePage() {
		driver.get("http://automationpractice.com/");
	}
}