package practice.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VacationTest {

    @Test
    void printIdLikeToVisit() {
        var visitStatement = new VacationTest();
        assertEquals("I'd like to visit \nBora \nBora\n ", Vacation.printVacation());
    }

}