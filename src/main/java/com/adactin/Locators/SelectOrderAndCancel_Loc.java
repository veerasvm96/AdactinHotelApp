package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class SelectOrderAndCancel_Loc extends baseClass {
	
	public SelectOrderAndCancel_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@value='851445']")
	private WebElement SelectCancelHotel;
	
	@FindBy(xpath = "//input[@value='Cancel Selected']")
	private WebElement CancelButton;

	public WebElement getSelectCancelHotel() {
		return SelectCancelHotel;
	}

	public WebElement getCancelButton() {
		return CancelButton;
	}
}
