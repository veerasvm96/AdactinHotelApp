package com.adactin.Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.adactin.BaseClass.baseClass;

public class HomePage extends baseClass{

	public HomePage(WebDriver xdriver) {
		this.driver = xdriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[contains(@src,'logo.png')]")
	private WebElement adactinLogo;
	
	@FindBy(id = "username")
	private WebElement username;
	
	@FindBy(id = "password")
	private WebElement password;
	
	@FindBy(id = "login")
	public WebElement button;

	public WebElement getAdactinLogo() {
		return adactinLogo;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}
}
