package com.qa.Shopping;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingLandingPage {

	@FindBy(id = "search_query_top")
	private WebElement searchbox;
	
	public void search(String searchText) {
		searchbox.sendKeys(searchText);
		searchbox.submit();
	}
	
}
