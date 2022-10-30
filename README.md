# BusReservationComplete
Complete code base of Bus Reservation System .
In this Project we are covering these functionalities mentioned below 

#Providing provision of Registration of User for that ::
  * we have made a User Table with one to Many mapping with Role . Before running your code you have to insert ADMIN and USER Role in the Role table then while you Run the 
    Application you go on Register Page --> Enter Details --> Sumit . The Call will go to Registration COntroller and save the data to Database and then it will redirect 
    it to /login .
    
#/login  ->> you enter your email Id and password -> the call will go to login Controller --> User Service where it loadsUserByUserName -> it checkss the User present in DB 
             and the password match and then the request goes to --> Custom Success Handler . if the email or password is incorrect then the error is thrown on UI that 
             Either Username or Password is Incorrect .
             
#Custom Success Handler ->> The Custom Success Handler , Handles the request basis on the ROle of the User after Login process --> if the ROle is Admin , it will redirect 
                            to Admin Dashboard , if Role is User then it will redirect to User Dashboard .
                            
#Admin Dashboard ->> So , Admin Dashboard shows a form to upload the Bus data and it gets stored in Bus data Table .
#User Dashboard ->> User Dashboard shows a filter to filter the Buses available for your to destination to from destination on a particular date . 
#Filetered data ->> Buses Data is visible on Dashboard screen in the form of table . When you Click on Book button it will take you to the Booking page .
#Booking Page ->> Here you will enter the no of passengers who are tralvelling along with you and automatically the Cost you have to pay will be calculated after 
                  you click on pay .
                  
#Email with Ticket ->> A Dynamic Ticket is generated after you click on pay and is sent to the user's registered Email Id .And you will be redirected to the All your Bookings
                       Page where you can see your all the booking in Tabular format with latest one on the top .
                       
#Summary Page ->> This the Page where all your booking are available in Tabular Format and a button for Cancellation and Ticket Generation is given .

#Cancel button ->> You can Cancel your booking , by clicking on the Cancel button .
#Ticket Generation ->> if the passenger has lost the Ticket , he can agin request for Generation of Ticket by clicking here .


                       
    This is the Complete Jist of the Bus Reservation System.
