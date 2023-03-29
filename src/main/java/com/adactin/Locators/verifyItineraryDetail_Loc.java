package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class verifyItineraryDetail_Loc extends baseClass {

	public verifyItineraryDetail_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "hotel_name_851445" )
	private WebElement HotelName;
	
	@FindBy(id = "location_851445")
	private WebElement Location;
	
	@FindBy(id = "first_name_851445")
	private WebElement FirstName;
	
	@FindBy(id = "last_name_851445")
	private WebElement  LastName;
	
	@FindBy(id = "no_days_851445")
	private WebElement NoOfDays;
	
	@FindBy(id = "room_type_851445")
	private WebElement RoomType;
	
	@FindBy(id = "price_night_851445")
	private WebElement PricePerNight;

	public WebElement getHotelName() {
		return HotelName;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getNoOfDays() {
		return NoOfDays;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getPricePerNight() {
		return PricePerNight;
	}
	
	
}
