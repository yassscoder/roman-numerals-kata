import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test
    @DisplayName("return I when arabic number is 1")
    void return_I_if_number_1() {
        assertEquals("I", RomanNumerals.convert(1));
    }
    @Test
    @DisplayName("return II when arabic number is 2")
    void return_II_if_number_2(){
        assertEquals("II", RomanNumerals.convert(2));
    }
    @Test
    @DisplayName("return III when arabic number is 3")
    void return_III_if_number_3(){
        assertEquals("III", RomanNumerals.convert(3));
    }
}
