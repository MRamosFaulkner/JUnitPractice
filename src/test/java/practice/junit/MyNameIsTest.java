package practice.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyNameIsTest {

    @Test
    void printsWhatMyNameIs() {
        var name = new MyNameIsTest();
        assertEquals("My name is Miosotis Ramos-Faulkner", MyNameIs.printName());
    }

}