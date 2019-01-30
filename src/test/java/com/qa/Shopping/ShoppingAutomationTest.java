package com.qa.Shopping;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


public class ShoppingAutomationTest {

	WebDriver driver;

	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After
	public void teardown() {
		driver.quit();
	}

	@Test
	public void testRegisterLogin() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Constants.URL);
		ShoppingLandingPage shoppingLandingPage = PageFactory.initElements(driver, ShoppingLandingPage.class);
		shoppingLandingPage.search("summer dress");
		ShoppingSearchPage shoppingSearchPage = PageFactory.initElements(driver, ShoppingSearchPage.class);
		assertEquals(Constants.PRODUCT + " not found", Constants.PRODUCT, shoppingSearchPage.checkFor(Constants.PRODUCT));
		Thread.sleep(1000);
	}

}
