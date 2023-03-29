package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class OrderSearch_Loc extends baseClass{
	
	public OrderSearch_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "order_id_text")
	private WebElement orderSearch;
	
	@FindBy(id = "search_hotel_id")
	private WebElement GoButton;

	public WebElement getOrderSearch() {
		return orderSearch;
	}

	public WebElement getGoButton() {
		return GoButton;
	}
}
