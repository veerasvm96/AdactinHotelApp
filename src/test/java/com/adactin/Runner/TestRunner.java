package com.adactin.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".\\src\\test\\java\\Feature", glue = "com.adactin.Stepdefinition",
tags = "@smoke", plugin = {"pretty","html:target\\report\\Adactin2.html",
							"json:target\\report\\Automationreport2.json"},stepNotifications = true)


public class TestRunner {

}
