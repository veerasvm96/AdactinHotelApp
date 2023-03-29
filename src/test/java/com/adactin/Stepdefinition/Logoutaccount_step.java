package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class Logoutaccount_step extends baseClass{
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User Afrer Getting hotel and try to Logout Account")
	public void user_afrer_getting_hotel_and_try_to_logout_account() {
	    elementClick(obj.getLogoutHotel().LogoutHotelPage);
	}

}
