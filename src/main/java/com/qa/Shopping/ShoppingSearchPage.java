package com.qa.Shopping;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class ShoppingSearchPage {

	@FindBys({
		@FindBy(className = "product-name"),
	})
	private List<WebElement> products;
	
	public String checkFor(String product) {
		for(int i=0; i < products.size(); i++) {
			if (products.get(i).getText().equals(product)) {
				return products.get(i).getText();
			}
		}
		return null;
	}
	
}
