package com.adactin.Stepdefinition;

import org.openqa.selenium.WebElement;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class verifyMyItinerary_step extends baseClass {
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Click on MyItinerary Button")
	public void user_click_on_my_itinerary_button() {
	    IsEnabled(obj.getMyItinerary().verifyMyItinerary);
	    elementClick(obj.getMyItinerary().verifyMyItinerary);
	}

}
