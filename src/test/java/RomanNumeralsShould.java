import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @Test
    @DisplayName("return I when arabic number is 1")
    void return_I_if_number_1() {
        assertEquals("I", RomanNumerals.convert(1));
    }
}
