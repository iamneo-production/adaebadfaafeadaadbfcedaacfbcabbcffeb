Feature: User Module CarListing and My Booking 

Scenario: Here We are Booking a Car then Noting down the fromdate and Verifying it in Admin New Bookings then noting down the Booking no of that Car and Verifying in User My Booking
          
   Given User Launch Chrome browser
    When User Opens url "https://carrental.neohire.io/" 
   Then User Clicks on LoginRegister button and Enters Valid Email Address as "kalyanguguloth111@gmail.com" and Password as "@Kalki111"
   Then User Clicks on User Login button
   Then User Clicks on Car Listing and clicks on Car View Details and verify interfaces
   Then User Selects from date and To date of Car Booking
   And enter the message and click on Book button
   Then Verify Booking Successful or not and Click on Logout button
   Then User Navigates to Admin Login Page
   Then User enters username as "admin" and password as "Test@12345"
   Then User clicks on Login Option
   Then User able to see admin page successfully
   Then User clicks on Bookings Option and verify its Categorieslist
   When User Clicks on New Option and Verify Interface
   Then Verify Noted FromDate in New Bookings and Note Booking No
   Then User Clicks on logout button and back to home button
   Then User Clicks on LoginRegister button and Enters Valid Email Address as "kalyanguguloth111@gmail.com" and Password as "@Kalki111"
   Then User Clicks on Login button and Drop Down list and Select My Booking Option verify its interface
   Then Verify the Status of Noted Booking Number and Clicks on Logout button

