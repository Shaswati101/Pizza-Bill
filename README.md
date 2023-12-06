# Pizza-Bill

Project Title: Pizza Ordering System

Project Overview:
This project implements a basic Pizza Ordering System with a focus on object-oriented programming concepts. It includes a Pizza class and a specialized DeluxPizza subclass, demonstrating inheritance and method overriding.

Classes:

1. Pizza:
    Attributes:
      price, veg, extraCheesePrice, extraToppingsPrice, backPackPrice, basePizzaPrice, isExtraCheeseAdded, isExtraToppingsAdded,         isOptedforTakeout.
      A constructor initializes basic attributes based on whether the pizza is vegetarian.
  
    Methods:
      addExtraCheese(), addExtraToppings(), takeAway(), getBill().
      getBill() generates a bill summary based on selected options and prints the total price.

2. DeluxPizza (Subclass of Pizza):
    The constructor invokes the superclass constructor and adds extra cheese and toppings.
    Overrides addExtraCheese() and addExtraToppings() with empty implementations.

3. Usage:
    The Main class demonstrates the creation of a DeluxPizza object, followed by printing the bill.

Features:
  Customizable pizza options: extra cheese, extra toppings, takeout.
  Demonstrates inheritance and method overriding.

Instructions:
  Instantiate a Pizza or DeluxPizza object with appropriate parameters.
  Use methods like addExtraCheese(), addExtraToppings(), and takeAway() to customize the order.
  Obtain the bill using the getBill() method.

Notes:
  The getBill() method dynamically generates the bill based on selected options and prints the total amount.

Considerations:
  This is a basic implementation for educational purposes, and additional features can be added for a real-world scenario.
  The code emphasizes OOP principles such as encapsulation, inheritance, and polymorphism.
