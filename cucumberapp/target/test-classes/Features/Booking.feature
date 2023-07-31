Feature: Verify The Admin Booking Functionality of Car Rental Website
   
Background: 
   Given User Launch Chrome browser
   When User Opens url "https://carrental.neohire.io/" 
   Then User Navigates to Admin Login Page
   Then User enters username as "admin" and password as "Test@12345"
   Then User clicks on Login Option
   Then User able to see admin page successfully
   Then User clicks on Bookings Option and verify its Categorieslist
  
 Scenario:  Verify the New Bookings(Confirm) Functionality of Car Rental Website and Verifying Noted Booking No In User My Booking status reflected or not
   When User Clicks on New Option and Verify Interface
   Then User Clicks on Show drop down list and verify it
   Then User Verify PREVIOUS and NEXT buttons of Bookings
   Then User Enter Car Name in Search Bar "Lamborghini" and Verify it
   Then User Clicks on view option and Display Status of Noted Booking Id
   Then User Clicks on Confirm Booking verify pop message and cancel it and Confirm it
   Then User Clicks on logout button and back to home button
   Then User Clicks on LoginRegister button and Enters Valid Email Address as "kalyanguguloth111@gmail.com" and Password as "@Kalki111"
   Then User Clicks on Login button and Drop Down list and Select My Booking Option verify its interface
   Then Verify the Status of Noted Booking Number and Clicks on Logout button
  
   
 Scenario:  Verify the New Bookings(Cancel) Functionality of Car Rental Website and Verifying Noted Booking No In User My Booking status reflected or not
   When User Clicks on New Option and Verify Interface
   Then User Enter Car Name in Search Bar "Lamborghini" and Verify it
   Then User Clicks on view option and Display Status of Noted Booking Id
   Then User Clicks on Cancel Booking verify pop message and cancel it and Confirm it
   Then User Clicks on logout button and back to home button
   Then User Clicks on LoginRegister button and Enters Valid Email Address as "kalyanguguloth111@gmail.com" and Password as "@Kalki111"
   Then User Clicks on Login button and Drop Down list and Select My Booking Option verify its interface
   Then Verify the Status of Noted Booking Number and Clicks on Logout button
  
      
   
 Scenario:  Verify the Confirmed Bookings Functionality of Car Rental Website
   When User Clicks on Confirmed Option and Verify Interface
   Then User Clicks on Show drop down list and verify it
   Then User Verify PREVIOUS and NEXT buttons of Bookings
   Then User Enter Car Name in Search Bar "Lamborghini" and Verify it
   Then User Clicks on view option and Display Status of Noted Booking Id
   Then User Clicks on logout button and back to home button
  
  
Scenario:  Verify the Canceled Bookings Functionality of Car Rental Website
   When User Clicks on Canceled Option and Verify Interface
   Then User Clicks on Show drop down list and verify it
   Then User Verify PREVIOUS and NEXT buttons of Bookings   
   Then User Enter Car Name in Search Bar "Lamborghini" and Verify it
   Then User Clicks on view option and Display Status of Noted Booking Id
   Then User Clicks on logout button and back to home button
