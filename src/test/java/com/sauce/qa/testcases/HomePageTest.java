package com.sauce.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sauce.qa.base.TestBase;
import com.sauce.qa.pages.CartPage;
import com.sauce.qa.pages.HomePage;
import com.sauce.qa.pages.LoginPage;
import com.sauce.qa.util.TestUtil;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	CartPage cartPage;
	
	public HomePageTest() {
		super();
	}

	// Test cases should be separated --independent of each other
		// before each test case launch the browser and login
		// after each tc - close the browser
	@BeforeMethod
	public void setUp() {
		intialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));// already intialized by super keyword
		
	}
	
	
	
	@Test(priority = 1)
	public void clickonAddtoCartTest() {
	homePage =	homePage.clickonAddToCart(); 	 	
	}
	
	@Test(priority = 2)
	public void viewCartPageTest() {
		cartPage = homePage.viewCartPage();
	}
	
	
	@Test(priority = 3)
	public void sortTheProductsTest(String value) {
	homePage =  homePage.sortTheProducts("Name (Z to A)");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	
	}
}
