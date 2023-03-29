package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage extends baseClass {
	
	PageObjectManager obj  = new PageObjectManager(driver);
	
	@Given("user Launch The {string} Browser")
	public void user_launch_the_browser(String string) {
		browserLaunch(string);
	}
	
	@Given("User Navigate The URL {string}")
	public void user_navigate_the_url(String string) {
	    launchURL(string);
	    //launchURL(propertyRead(string));
	}
	
	@Given("User verify The Home page")
	public void user_verify_the_home_page() {
	    IsDisplayedElement(obj.getHomePage().getAdactinLogo());
	    
	}
	
	@Then("User check Invalid Username {string} and correct Password {string}")
	public void user_check_invalid_username_and_correct_password(String string, String string2) {
	    elementSendKeys(obj.getHomePage().getUsername(), string);
	    elementSendKeys(obj.getHomePage().getPassword(), string2);
	}
	
	@Then("User check correct Username {string} and Invalid Password {string}")
	public void user_check_correct_username_and_invalid_password(String string, String string2) {
	    elementSendKeys(obj.getHomePage().getUsername(), string);
	    elementSendKeys(obj.getHomePage().getPassword(), string2 );
	}
	
	@Then("User check Invalid Username {string} and Invalid Password {string}")
	public void user_check_invalid_username_and_invalid_password(String string, String string2) {
	    elementSendKeys(obj.getHomePage().getUsername(), string);
	    elementSendKeys(obj.getHomePage().getPassword(), string2);
	}
	
	@Then("User Enter The Username {string}")
	public void user_enter_the_username(String string) {
		elementSendKeys(obj.getHomePage().getUsername(), string);
	   
	}
	
	@Then("User Enter The Password {string}")
	public void user_enter_the_password(String string) {
	    elementSendKeys(obj.getHomePage().getPassword(), string);
	}
	
	@Then("User Click The Login Button")
	public void user_click_the_login_button() {
	    elementClick(obj.getHomePage().button);
	}


}
