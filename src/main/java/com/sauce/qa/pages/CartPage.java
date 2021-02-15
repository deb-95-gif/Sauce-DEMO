package com.sauce.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sauce.qa.base.TestBase;

public class CartPage extends TestBase {
	
	
	@FindBy(css ="#cart_contents_container > div > div.cart_list > div.cart_item > div.cart_item_label > div.item_pricebar > button")
	WebElement removeBtn;
	
	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public CartPage removeitemFromCart() {
		removeBtn.click();
		return new CartPage();
	}

}
