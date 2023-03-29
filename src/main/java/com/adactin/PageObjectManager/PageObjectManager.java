package com.adactin.PageObjectManager;

import org.openqa.selenium.WebDriver;

import com.adactin.BaseClass.baseClass;
import com.adactin.Locators.BookAHotel_Loc;
import com.adactin.Locators.CancelHotel_Loc;
import com.adactin.Locators.GetOrderNumber_Loc;
import com.adactin.Locators.HomePage;
import com.adactin.Locators.LogoutHotel_loc;
import com.adactin.Locators.OrderSearch_Loc;
import com.adactin.Locators.SearchHotelLocators;
import com.adactin.Locators.SearchHotelResult;
import com.adactin.Locators.SelectHotel_Loc;
import com.adactin.Locators.SelectOrderAndCancel_Loc;
import com.adactin.Locators.VerifyHotelDetails_loc;
import com.adactin.Locators.verifyItineraryDetail_Loc;
import com.adactin.Locators.verifyMyItinerary_Loc;

public class PageObjectManager extends baseClass{
	
	public PageObjectManager(WebDriver xdriver) {
		this.driver = xdriver;
	}
	
	private HomePage HomePage;
	public HomePage getHomePage() {
		
		if(HomePage == null) {
			HomePage = new HomePage(driver);
		}
		return HomePage;
	}
	
	private SearchHotelLocators SearchHotel;
	public SearchHotelLocators getSearchHotel() {
		if(SearchHotel == null) {
			SearchHotel = new SearchHotelLocators(driver);
		}
		return SearchHotel;
	}
	
	private SearchHotelResult Searchresult;
	public SearchHotelResult getSearchHotelresult() {
		if(Searchresult == null) {
			Searchresult = new SearchHotelResult(driver);
		}
		return Searchresult;
	}
	
	private SelectHotel_Loc selectHotel;
	public SelectHotel_Loc getSelectHotel() {
		
		if (selectHotel == null) {
			selectHotel = new SelectHotel_Loc(driver);
		}
		return selectHotel;
	}
	
	private LogoutHotel_loc logoutHotel;

	public LogoutHotel_loc getLogoutHotel() {
		if(logoutHotel == null) {
			logoutHotel = new LogoutHotel_loc(driver);
		}
		return logoutHotel;
	}
	
	private VerifyHotelDetails_loc verifyHotelDetails;
	public VerifyHotelDetails_loc getVerifyHotelDetails() {
		if(verifyHotelDetails == null) {
			verifyHotelDetails = new VerifyHotelDetails_loc(driver);
		}
		return verifyHotelDetails;
	}
	
	private BookAHotel_Loc BookHotel;
	public BookAHotel_Loc getBookHotel() {
		if(BookHotel == null) {
			BookHotel = new BookAHotel_Loc(driver);
		}
		return BookHotel;
	}
	
	private GetOrderNumber_Loc OrderNumberGet;
	public GetOrderNumber_Loc getOrderNumberGet() {
		if(OrderNumberGet ==  null) {
			OrderNumberGet = new GetOrderNumber_Loc(driver);
		}
		return OrderNumberGet;
	}
	
	private verifyMyItinerary_Loc MyItinerary;
	public verifyMyItinerary_Loc getMyItinerary() {
		
		if(MyItinerary == null) {
			MyItinerary = new verifyMyItinerary_Loc(driver);
		}
		return MyItinerary;
	}
	
	private  verifyItineraryDetail_Loc verifyItineraryDetail;
	public verifyItineraryDetail_Loc getVerifyItineraryDetail() {
		
		if(verifyItineraryDetail == null) {
			verifyItineraryDetail = new verifyItineraryDetail_Loc(driver);
		}
		return verifyItineraryDetail;
	}
	
	private OrderSearch_Loc OrderSearch;
	public OrderSearch_Loc getOrderSearch() {
		
		if(OrderSearch == null) {
			OrderSearch = new OrderSearch_Loc(driver);
		}
		return OrderSearch;
	}
	
	private CancelHotel_Loc CancelHotel;
	public CancelHotel_Loc getCancelHotel() {
		if(CancelHotel == null) {
			CancelHotel = new CancelHotel_Loc(driver);
		}
		return CancelHotel;
	}
	
	private SelectOrderAndCancel_Loc OrderCancel;
	public SelectOrderAndCancel_Loc getOrderCancel() {
		if(OrderCancel == null) {
			OrderCancel = new SelectOrderAndCancel_Loc(driver);
		}
		return OrderCancel;
	}
	
}
