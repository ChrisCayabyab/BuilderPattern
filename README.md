# BuilderPattern

Problem Scenario

Imagine you're developing an e-commerce application where customers create accounts with varying levels of detail.

Initially, you use a standard constructor for the User class:

public User(String firstName, String lastName, String email,
           String address, String phone, int age) {
     // ...
}

However, you encounter challenges:

Registration forms: It's cumbersome to ensure users enter all fields in the correct order, leading to errors and frustration.
Optional fields: Not all customers provide complete information, but the constructor forces them to.
Data consistency: Changes to user profiles after registration can cause unexpected issues due to mutable fields.


![Blank diagram (6)](https://github.com/ChrisCayabyab/BuilderPattern/assets/142383617/bfd601a2-a1cf-4c66-9982-4941be4ea6f9)


<img width="608" alt="image" src="https://github.com/ChrisCayabyab/BuilderPattern/assets/142383617/54de008e-5cf1-4ee9-98d3-93f21cf1bdbd">

