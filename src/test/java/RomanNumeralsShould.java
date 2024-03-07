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
            "3, III"
    })
    void return_roman(int arabicNumber, String romanNumeral) {
        assertEquals(romanNumeral, RomanNumerals.convert(arabicNumber));
    }
}
