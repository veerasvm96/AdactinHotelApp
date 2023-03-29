package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class BookAHotel_Loc extends baseClass{
	
	public BookAHotel_Loc(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first_name")
	public WebElement firstName;
	
	@FindBy(id = "last_name")
	public WebElement lastName;
	
	@FindBy(id = "address")
	public WebElement address;
	
	@FindBy(id = "cc_num")
	public WebElement cardNumber;
	
	@FindBy(id = "cc_type")
	public WebElement cardType;
	
	@FindBy(id = "cc_exp_month")
	public WebElement expireMonth;
	
	@FindBy(id = "cc_exp_year")
	public WebElement expireYear;
	
	@FindBy(id = "cc_cvv")
	public WebElement cvvNumber;
	
	@FindBy(id = "book_now")
	public WebElement bookNow;
}
