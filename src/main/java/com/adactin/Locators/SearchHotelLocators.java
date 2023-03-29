package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class SearchHotelLocators extends baseClass {
	
	public SearchHotelLocators(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "location")
	private WebElement hotelLocation;
	
	@FindBy(id = "hotels")
	private WebElement selectHotel;
	
	@FindBy(id = "room_type")
	private WebElement selectRoomType;
	
	@FindBy(id = "room_nos")
	private WebElement selectNoOfRooms;
	
	@FindBy(id = "datepick_in")
	private WebElement checkInDate;
	
	@FindBy(id = "datepick_out")
	private WebElement checkOutDate;
	
	@FindBy(id = "checkin_span")
	private WebElement verifyDates;
	
	@FindBy(id = "adult_room")
	private WebElement adultRoom;
	
	@FindBy(id = "child_room")
	private WebElement childRoom;
	
	@FindBy(name = "Submit")
	private WebElement searchButton;

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getHotelLocation() {
		return hotelLocation;
	}

	public WebElement getSelectHotel() {
		return selectHotel;
	}

	public WebElement getSelectRoomType() {
		return selectRoomType;
	}

	
	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}
	
	
	public WebElement getVerifyDates() {
		return verifyDates;
	}

	public WebElement getSelectNoOfRooms() {
		return selectNoOfRooms;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	
}
