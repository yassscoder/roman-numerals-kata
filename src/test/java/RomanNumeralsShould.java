import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralsShould {

    @ParameterizedTest
    @DisplayName("return roman numeral")
    @CsvSource({
            "1, I",
            "2, II",
            "3, III",
            "4, IV",
            "5, V",
            "6, VI",
            "7, VII",
            "8, VIII",
            "9, IX",
            "10, X",
            "14, XIV",
            "19, XIX",
            "25, XXV",
            "39, XXXIX",
            "40, XL",
            "50, L",
            "89, LXXXIX",
            "90, XC",
            "99, XCIX",
            "100, C"
    })
    void return_roman_when_bigger_than_3(int arabicNumber, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(arabicNumber));
    }


}
