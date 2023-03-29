package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookAHotel_Step extends baseClass{

	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Book a Hotel So Enter FirstName")
	public void user_book_a_hotel_so_enter_first_name() {
	    elementSendKeys(obj.getBookHotel().firstName, "veera");
	    
	}
	@Then("User Enter LastName")
	public void user_enter_last_name() {
	    elementSendKeys(obj.getBookHotel().lastName, "S");
	    
	}
	@Then("User Enter Billing Address")
	public void user_enter_billing_address() {
	    elementSendKeys(obj.getBookHotel().address, "chennai");
	    
	}
	@Then("Enter Credit card No")
	public void enter_credit_card_no() {
	    elementSendKeys(obj.getBookHotel().cardNumber, "1234567890123423");
	    
	}
	@Then("Select CardType")
	public void select_card_type() {
	    dropDownSelect(obj.getBookHotel().cardType, "text", "VISA");
	    
	}
	@Then("Select ExpireMonth and ExpireYear")
	public void select_expire_month_and_expire_year() {
	   dropDownSelect(obj.getBookHotel().expireMonth, "text", "February");
	   dropDownSelect(obj.getBookHotel().expireYear, "text","2012");
	    
	}
	@Then("Enter CVV Number")
	public void enter_cvv_number() {
	    elementSendKeys(obj.getBookHotel().cvvNumber, "345");
	    
	}
	@Then("Click the Book Now Button")
	public void click_the_book_now_button() {
	    elementClick(obj.getBookHotel().bookNow);
	    
	}
}
