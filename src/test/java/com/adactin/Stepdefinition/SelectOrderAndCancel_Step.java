package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class SelectOrderAndCancel_Step extends baseClass{
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Select particular Booking and Cancel The Booked Hotel")
	public void user_select_particular_booking_and_cancel_the_booked_hotel() {
	    elementClick(obj.getOrderCancel().getSelectCancelHotel());
	    elementClick(obj.getOrderCancel().getCancelButton());
	    alertElement();
	}

}
