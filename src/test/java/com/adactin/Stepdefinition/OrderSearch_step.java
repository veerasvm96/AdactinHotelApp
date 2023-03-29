package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class OrderSearch_step extends baseClass{
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Search The Order Using OrderId {string} to Get Details")
	public void user_search_the_order_using_order_id_to_get_details(String string) {
	    elementSendKeys(obj.getOrderSearch().getOrderSearch(), string);
	}
	
	@Then("User Click The Go Button")
	public void user_click_the_go_button() {
	    elementClick(obj.getOrderSearch().getGoButton());
	}

}
