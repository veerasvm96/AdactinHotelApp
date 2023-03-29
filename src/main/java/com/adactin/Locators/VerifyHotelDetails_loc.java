package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class VerifyHotelDetails_loc extends baseClass{
	
	public VerifyHotelDetails_loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "hotel_name_dis")
	public WebElement verifyHoetelName;
	
	@FindBy(id = "location_dis")
	public WebElement verifyLocation;
	
	@FindBy(id = "room_type_dis")
	public WebElement verifyRoomType;
	
	@FindBy(id = "total_days_dis")
	public WebElement verifyTotalDay;
	
	@FindBy(id = "price_night_dis")
	public WebElement verifyPricePerNight;

}
