package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class verifyItineraryDetails_step extends baseClass {
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Verify the Itinerary Details of HotelName")
	public void user_verify_the_itinerary_details_of_hotel_name() {
	    String ActualValue = "Hotel Sunshine";
	    Assert.assertEquals(ActualValue, elementGetAttribute(obj.getVerifyItineraryDetail().getHotelName(), "value"));
	}
	
	@Given("Verify the Location")
	public void verify_the_location() {
		String ActualValue = "Melbourne";
		Assert.assertEquals(ActualValue, elementGetAttribute(obj.getVerifyItineraryDetail().getLocation(), "value"));
	}
	
	@Given("Verify the FirstName")
	public void verify_the_first_name() {
		String ActualValue = "veera";
		Assert.assertEquals(ActualValue, elementGetAttribute(obj.getVerifyItineraryDetail().getFirstName(), "value")); 
	}
	
	@Given("Verify the LastName")
	public void verify_the_last_name() {
		String ActualValue = "S";
	    Assert.assertEquals(ActualValue,elementGetAttribute(obj.getVerifyItineraryDetail().getLastName(), "value"));
	}
	
	@Given("Verify the No.OfDays")
	public void verify_the_no_of_days() {
	    String ActualValue ="1 Days";
	    Assert.assertEquals(ActualValue, elementGetAttribute(obj.getVerifyItineraryDetail().getNoOfDays(), "value"));
	}
	
	@Given("Verify the RoomType")
	public void verify_the_room_type() {
	    String ActualValue = "Standard";
	    Assert.assertEquals(ActualValue,elementGetAttribute(obj.getVerifyItineraryDetail().getRoomType(), "value"));   
	}
	
	@Given("Verify the PricePerNight")
	public void verify_the_price_per_night() {
	    String ActualValue = "AUD $ 175";
	    Assert.assertEquals(ActualValue, elementGetAttribute(obj.getVerifyItineraryDetail().getPricePerNight(), "value"));
	}

}
