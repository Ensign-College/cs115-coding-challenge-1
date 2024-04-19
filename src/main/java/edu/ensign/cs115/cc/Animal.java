package edu.ensign.cs115.cc;

public class Animal {
   
    // Constructor
    public Animal(String name, int age) {
        
    }

    // Method for animal eating (to be overridden)
    public String eat() {
        return "This animal eats food.";
    }

    // Method for animal sleeping (to be overridden)
    public String sleep() {
        return "This animal sleeps.";
    }
}
