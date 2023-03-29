package com.adactin.Stepdefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.adactin.BaseClass.baseClass;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends baseClass{
	
	@After
	public void afterHooks(Scenario scenario) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
	}
}
