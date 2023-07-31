Feature: Verify The Admin Reqistered Users Functionality of Car Rental Website

Scenario:  Verify Registered Users Of Admin Module 
   
   Given User Launch Chrome browser
   When User Opens url "https://carrental.neohire.io/" 
   Then User Navigates to Admin Login Page
   Then User enters username as "admin" and password as "Test@12345"
   Then User clicks on Login Option
   Then User able to see admin page successfully
   Then User clicks on Req Users option and Verify Interface
   Then User Clicks on Show drop down list and verify it
   Then User Verify PREVIOUS and NEXT buttons of Bookings
   Then User Enter Name in Search Bar "Kalyan" and verify it
   Then User Clicks on logout button and back to home button
  
  
 
 