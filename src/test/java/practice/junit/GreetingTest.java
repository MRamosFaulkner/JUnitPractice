package practice.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void printNameGreeting() {
        var name = new GreetingTest();
        assertEquals("Hi Lola", Greeting.printGreeting());
    }

}