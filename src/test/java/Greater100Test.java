import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Greater100Test {
    @Test

    void greater100_100(){

        //given
        int number = 100;

        //when
        String actual = Greater100.greater100(number);

        //then
        String expected = "Zahl ist nicht größer als 100";

    }

}