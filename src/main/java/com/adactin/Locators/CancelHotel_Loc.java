package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class CancelHotel_Loc extends baseClass {
	
	public CancelHotel_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "btn_id_851445")
	private WebElement CancelHotelLink;

	public WebElement getCancelHotelLink() {
		return CancelHotelLink;
	}

}
