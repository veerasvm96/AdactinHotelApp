package com.adactin.Stepdefinition;

import org.junit.Assert;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class SearchHotelResult extends baseClass{
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User verify the location dropdown value and searchHotel location value")
	public void user_verify_the_location_dropdown_value_and_search_hotel_location_value() {
	    String ActualValue ="Melbourne";
	    Assert.assertEquals(ActualValue, elementGetAttribute(obj.getSearchHotelresult().getLoactionSearch(), "value"));
	}
	
	@Given("verify the select date and Displayed dates are same")
	public void verify_the_select_date_and_displayed_dates_are_same() {
	    String actualValue = "22/03/2023";
	    Assert.assertEquals(actualValue, elementGetAttribute(obj.getSearchHotelresult().checkInDate, "value"));
	   
	}
	
	@Given("verify the selected no.of rooms and Displayed rooms are same")
	public void verify_the_selected_no_of_rooms_and_displayed_rooms_are_same() {
	    String actualValue = "3 Rooms";
	    Assert.assertEquals(actualValue, elementGetAttribute(obj.getSearchHotelresult().NoOfRooms, "value"));
	}
	
	@Given("verify the selected roomType and Displayed roomType are same")
	public void verify_the_selected_room_type_and_displayed_room_type_are_same() {
	    String actualValue ="Standard";
	    Assert.assertEquals(actualValue, elementGetAttribute(obj.getSearchHotelresult().RoomType, "value"));
	}
}
