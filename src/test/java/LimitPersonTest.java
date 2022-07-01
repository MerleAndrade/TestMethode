import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LimitPersonTest {
    @Test
    void testLimitPerson31(){

        //given
        int numberOfPersons  = 31;

        //when
        String actual = LimitPerson.limitedPerson(numberOfPersons);

        //then
        String expected = "Zu viele Personen";
        Assertions.assertEquals(expected, actual);


    }
}