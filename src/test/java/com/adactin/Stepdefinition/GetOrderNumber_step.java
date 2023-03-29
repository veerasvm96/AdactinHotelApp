package com.adactin.Stepdefinition;

import com.adactin.BaseClass.baseClass;
import com.adactin.PageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;

public class GetOrderNumber_step extends baseClass {
	
	PageObjectManager obj = new PageObjectManager(driver);
	
	@Given("User get the OrderNumber")
	public void user_get_the_order_number() {
	    String elementGetAttribute = elementGetAttribute(obj.getOrderNumberGet().orderNumber, "value");
	    System.out.println("order created and order number:" + elementGetAttribute);
	}

}
