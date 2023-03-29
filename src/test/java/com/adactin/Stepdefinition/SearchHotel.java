package com.adactin.Stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SearchHotel extends baseClass{
	
	PageObjectManager obj1  = new PageObjectManager(driver);
	
	@Given("User select the Location")
	public void user_select_the_location() {
	    dropDownSelect(obj1.getSearchHotel().getHotelLocation(), "text", "Melbourne");
	}
	@Given("Select Hotels")
	public void select_hotels() {
	    dropDownSelect(obj1.getSearchHotel().getSelectHotel(), "text","Hotel Sunshine");
	    
	}
	@Given("Select Room Type")
	public void select_room_type() {
	    dropDownSelect(obj1.getSearchHotel().getSelectRoomType(), "text","Standard");
	    
	}
	@Given("Select No.of Rooms")
	public void select_no_of_rooms() {
	    dropDownSelect(obj1.getSearchHotel().getSelectNoOfRooms(), "text","3 - Three");
	}
	
	@Given("Choose CheckIn Date {string}")
	public void choose_check_in_date(String string) {
	    elementSendKeys(obj1.getSearchHotel().getCheckInDate(), string);
		
	}
	
	@Given("Choose CheckOut Date {string}")
	public void choose_check_out_date(String string) {
	    elementSendKeys(obj1.getSearchHotel().getCheckOutDate(), string);
	}
	
	@Given("verify the CheckIn Date less than CheckOut Date")
	public void verify_the_check_in_date_less_than_check_out_date() {
	    IsDisplayedElement(obj1.getSearchHotel().getVerifyDates());
	}
	
	@Given("Select Adults per Room")
	public void select_adults_per_room() {
	    dropDownSelect(obj1.getSearchHotel().getAdultRoom(), "text","2 - Two");
	}
	@Given("Select Childerss per Room")
	public void select_childerss_per_room() {
	    dropDownSelect(obj1.getSearchHotel().getChildRoom(), "text","3 - Three");
	    
	}
	@Then("Click The Search Button")
	public void click_the_search_button() {
	   elementClick(obj1.getSearchHotel().getSearchButton());
	}

}
