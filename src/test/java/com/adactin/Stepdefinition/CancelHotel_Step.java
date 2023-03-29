package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class CancelHotel_Step extends baseClass{
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Cancel The Booked Hotel")
	public void user_cancel_the_booked_hotel() {
	elementClick(obj.getCancelHotel().getCancelHotelLink());
	alertElement();
	}


}
