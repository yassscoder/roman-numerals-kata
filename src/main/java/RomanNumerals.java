public class RomanNumerals {
    public static String convert(int arabicNumber) {
        String romanNumeral = "";
        for (int i = 0; i < arabicNumber; i++) {
            romanNumeral += "I";
        }
        return romanNumeral;
    }
}
