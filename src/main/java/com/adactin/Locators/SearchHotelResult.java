package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

import io.cucumber.java.en.Given;

public class SearchHotelResult extends baseClass {

	public SearchHotelResult(WebDriver xdriver) {
		this.driver =  xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location_0")
	private WebElement loactionSearch;
	
	@FindBy(id = "arr_date_0")
	public WebElement checkInDate;
	
	@FindBy(id = "rooms_0")
	public WebElement NoOfRooms;
	
	@FindBy(id = "room_type_0")
	public WebElement RoomType;

	public WebElement getLoactionSearch() {
		return loactionSearch;
	}
}
