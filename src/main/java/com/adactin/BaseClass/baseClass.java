package com.adactin.BaseClass;

import java.io.FileReader;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.RetryPolicy;
import io.cucumber.core.backend.Options;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class baseClass {

	public static WebDriver driver;
	
	public static void browserLaunch(String string) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	public static void launchURL(String string) {
		driver.get(string);

	}
	
	public static boolean IsDisplayedElement(WebElement element) {
		boolean display = false;
		
		try {
			display = element.isDisplayed();
		} catch (Exception e) {
			System.out.println("element not displayes L" +e.getMessage());
		}
		return display;
	}
	
	public static boolean IsEnabled(WebElement element) {
		boolean display = false;
		try {
			display = element.isEnabled();
		} catch (Exception e) {
			System.out.println("unable to find webElement :" + e.getMessage());
		}
		return display;
	}
	
	public static void elementSendKeys(WebElement element, String value) {
		
		try {
			element.clear();
			element.sendKeys(value);
		} catch (Exception e) {
			System.out.println("unable to send element in sendkeys :" +e.getMessage());
		}
	}
	
	public static void elementClick(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println("unable to click element :" +e.getMessage());
		}
	}
	
	public static String propertyRead(String key) {
		String path = "\\src\\test\\resources\\PropertyFile\\config.properties";
		String value = null;
		try {
			FileReader f = new FileReader(path);
			Properties p = new Properties();
			p.load(f);
			value = p.getProperty(key);
		} catch (Exception e) {
			System.out.println("unable to find testdata :" +e.getMessage());
		}
		return value;

	}
	
	public static void dropDownSelect(WebElement element, String option, String i) {
		Select s = new Select(element);
		try {
			if(option.equals("index")) {
				s.selectByIndex(Integer.parseInt(i));
			} else if (option.equals("text")) {
				s.selectByVisibleText(i);
			} else if (option.equals("value")) {
				s.selectByValue(i);
			}
		} catch (Exception e) {
			System.out.println("unable to find dropdown value :" +e.getMessage());
		}
	}
	
	public static String elementGetAttribute(WebElement element,  String value) {
		
		String a = null; 
		try {
			a = element.getAttribute(value);
		} catch (Exception e) {
			System.out.println("not able to get attribute value :" +e.getMessage());
		}
		return a;
	}
	
	public static void alertElement() {
		try {
			Alert alert = driver.switchTo().alert();
			alert.accept();
		} catch (Exception e) {
			System.out.println("unable to find Elemnet :" +e.getMessage());
		}

	}
}
