package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class SelectHotel_Loc extends baseClass {

	public SelectHotel_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	public WebElement selectHotel;
	
	@FindBy(id = "continue")
	public WebElement clickContine;
}
