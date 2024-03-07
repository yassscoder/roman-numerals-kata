import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {
    @ParameterizedTest
    @DisplayName("return roman numeral for 1-3")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
    })
    void return_roman(int arabicNumber, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(arabicNumber));
    }

    @Test
    @DisplayName("return V when number is 5")
    void return_V_if_number_5() {
        assertEquals("V", RomanNumerals.convert(5));
    }

    @ParameterizedTest
    @DisplayName("return roman numeral when number is bigger than 5")
    @CsvSource({
            "6, VI",
            "7, VII",
            "8, VIII",
    })
    void return_roman_when_bigger_than_5(int arabicNumber, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(arabicNumber));
    }

    @Test
    @DisplayName("return IV when number is 4")
    void return_iv_when_number_is_4() {
        assertEquals("IV", RomanNumerals.convert(4));
    }
    @Test
    @DisplayName("return IX when number is 9")
    void return_ix_when_number_is_9() {
        assertEquals("IX", RomanNumerals.convert(9));
    }
}
