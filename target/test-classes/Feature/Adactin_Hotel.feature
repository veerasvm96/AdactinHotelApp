@regression
Feature: Adaction Hotel webApp Automation Scripts

@TC-001 @smoke
Scenario:
Given user Launch The "Chrome" Browser
And User Navigate The URL "http://adactinhotelapp.com/"
And User verify The Home page
Then User check Invalid Username "" and correct Password ""
And User Click The Login Button
Then User check correct Username "" and Invalid Password ""
And User Click The Login Button
Then User check Invalid Username "" and Invalid Password ""
And User Click The Login Button
Then User Enter The Username "veeramani1810"
Then User Enter The Password "veera@123"
And User Click The Login Button

Examples:
|userName|password|
|"veeramani181"|"veera@123"|
|"veeramani1810"|"veera123"|
|"veeramani@123"|"veera12"|
|"veeramani1810"|"veera@123"|

@TC-002 @smoke
Scenario:
Given User select the Location
And Select Hotels
And Select Room Type
And Select No.of Rooms
And Choose CheckIn Date "22/03/2023"
And Choose CheckOut Date "23/03/2023"
And Select Adults per Room
And Select Childerss per Room
Then Click The Search Button 

@TC-003 
Scenario:
Given User select the Location
And Select Hotels
And Select Room Type
And Select No.of Rooms
And Choose CheckIn Date "22/03/2023"
And Choose CheckOut Date "25/03/2023"
And verify the CheckIn Date less than CheckOut Date
And Select Adults per Room
And Select Childerss per Room
Then Click The Search Button 

@TC-004 
Scenario:
Given User verify the location dropdown value and searchHotel location value
And verify the select date and Displayed dates are same
And verify the selected no.of rooms and Displayed rooms are same
And verify the selected roomType and Displayed roomType are same

@TC-005 @smoke
Scenario:
Given User select the Hotel
And User After Select Hotel Click the Continue Button

@TC-007 
Scenario:
Given User Check wheather the HotelName is selected same as in previous Screen
Then User check wheather the Location is selected same as in previous Screen
Then User check wheather the RoomType is selected same as in previous Screen
Then check wheather the TotalDay is selected same as in previous Screen
Then check wheather the PricePerDay is selected same as in previous Screen

@TC-008 @smoke
Scenario:
Given User Book a Hotel So Enter FirstName
Then User Enter LastName
Then User Enter Billing Address
And Enter Credit card No
And Select CardType
And Select ExpireMonth and ExpireYear
And Enter CVV Number
Then Click the Book Now Button  

@TC-009
Scenario:
Given User get the OrderNumber

@TC-010 @smoke
Scenario:
Given User Click on MyItinerary Button

@TC-011
Scenario:
Given User Verify the Itinerary Details of HotelName
And Verify the Location
And Verify the FirstName
And Verify the LastName
And Verify the No.OfDays
And Verify the RoomType
And Verify the PricePerNight

@TC-012
Scenario:
Given User Search The Order Using OrderId "3469M24H8M" to Get Details 
Then User Click The Go Button

@TC-013
Scenario:
Given User Cancel The Booked Hotel 

@TC-014 @smoke
Scenario:
Given User Select particular Booking and Cancel The Booked Hotel

@TC-006
Scenario:
Given User Afrer Getting hotel and try to Logout Account