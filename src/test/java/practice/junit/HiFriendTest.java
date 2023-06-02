package practice.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HiFriendTest {

    @Test
    void printGreetingTogether() {
        var greeting = new HiFriendTest();
        assertEquals("Hi Larry Sprinkle!", HiFriend.printfriend());
    }

}