package edu.ensign.cs115.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void testEat() {
        Animal animal = new Animal("Generic Animal", 5);
        assertEquals("This animal eats food.", animal.eat(), "The eat method should return a generic eating message.");
    }

    @Test
    public void testSleep() {
        Animal animal = new Animal("Generic Animal", 5);
        assertEquals("This animal sleeps.", animal.sleep(),
                "The sleep method should return a generic sleeping message.");
    }
}
