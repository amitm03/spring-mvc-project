# Spring MVC - ThymetLeaf Project - Lab Test 909
Modules - 
1) Home - It shows total user count.
2) Search - It shows search window. You can search user from first name,second name,email.
    - Once the result is shown, you can see the details of user by click on see details button
3) Users - This page shows users list. User id,first name, last name, email is shown.
    - Update button is given to update the user details in next window.
    - Delete - It deletes the user from database.
4) Login form - It is given to implement login,logout and registration window. It is not complete task.
        - Its implenetation needs to be completed.
        - Spring Security(thymeleaf security 6) was going to be used for this.

# JAVA VERSION USED - 17

## Database 
1) Database used - MySQL on Docker Image
2) SQL query for user -
      use `social-media-database`;

       CREATE TABLE IF NOT EXISTS user(
       id INT PRIMARY KEY,
       first_name VARCHAR(255),
       last_name VARCHAR(255),
       email VARCHAR(255),
       password VARCHAR(255)
       );
