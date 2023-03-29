package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class SelectHotel_step extends baseClass{
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User select the Hotel")
	public void user_select_the_hotel() {
	    elementClick(obj.getSelectHotel().selectHotel);
	}
	
	@Given("User After Select Hotel Click the Continue Button")
	public void user_after_select_hotel_click_the_continue_button() {
	    elementClick(obj.getSelectHotel().clickContine);
	}
}
