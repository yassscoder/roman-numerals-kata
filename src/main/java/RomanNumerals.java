public class RomanNumerals {
    public static String convert(int arabicNumber) {
        String romanNumeral = "";
        if (arabicNumber == 5) {
            return "V";
        }
        if (arabicNumber < 5) {
            for (int i = 0; i < arabicNumber; i++) {
                romanNumeral += "I";
            }
        }
        return romanNumeral;
    }
}
