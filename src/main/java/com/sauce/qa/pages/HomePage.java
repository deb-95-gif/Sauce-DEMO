package com.sauce.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sauce.qa.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(xpath="//*[@id=\"inventory_container\"]/div/div[2]/div[3]/button")
	WebElement addToCart;
	
	@FindBy(css ="#shopping_cart_container > a > svg > path")
	WebElement viewCart;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	// check title of the page
	public String  verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public HomePage clickonAddToCart() {
		addToCart.click();
		return new HomePage();
	}
	
	public CartPage viewCartPage() {
		viewCart.click();
		return new CartPage();
	}
	
	
	public HomePage sortTheProducts(String text) {
		Select select = new Select(driver.findElement(By.cssSelector("#inventory_filter_container > select")));
		select.selectByVisibleText(text);;
		return new HomePage();
		
	}
	

}
