package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class VerifyHotelDetails_step extends baseClass {
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Check wheather the HotelName is selected same as in previous Screen")
	public void user_check_wheather_the_hotel_name_is_selected_same_as_in_previous_screen() {
		String expected = "Hotel Sunshine";
	    Assert.assertEquals(expected, elementGetAttribute(obj.getVerifyHotelDetails().verifyHoetelName, "value"));
	}
	
	@Then("User check wheather the Location is selected same as in previous Screen")
	public void user_check_wheather_the_location_is_selected_same_as_in_previous_screen() {
	    String expected = "Melbourne";
	    Assert.assertEquals(expected, elementGetAttribute(obj.getVerifyHotelDetails().verifyLocation, "value"));
	    
	}
	@Then("User check wheather the RoomType is selected same as in previous Screen")
	public void user_check_wheather_the_room_type_is_selected_same_as_in_previous_screen() {
	    String expected = "Standard";
	    Assert.assertEquals(expected,elementGetAttribute(obj.getVerifyHotelDetails().verifyRoomType, "value"));
	    
	}
	@Then("check wheather the TotalDay is selected same as in previous Screen")
	public void check_wheather_the_total_day_is_selected_same_as_in_previous_screen() {
	    String expected = "1 Day(s)";
	    Assert.assertEquals(expected, elementGetAttribute(obj.getVerifyHotelDetails().verifyTotalDay, "value"));
	    
	}
	@Then("check wheather the PricePerDay is selected same as in previous Screen")
	public void check_wheather_the_price_per_day_is_selected_same_as_in_previous_screen() {
	    String expected = "AUD $ 175";
	    Assert.assertEquals(expected, elementGetAttribute(obj.getVerifyHotelDetails().verifyPricePerNight, "value"));
	}

}
