package practice.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloThereTest {

    @Test
    void printPhraseCorrectly() {
        var phrase = new HelloThereTest();
        assertEquals("Hello there! How are you doing today?", HelloThere.printHelloThere());
    }

}