package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class GetOrderNumber_Loc extends baseClass{
	
	public GetOrderNumber_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "order_no")
	public WebElement orderNumber;
}
