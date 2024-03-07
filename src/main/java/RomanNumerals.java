public class RomanNumerals {
    public static String convert(int arabicNumber) {
        String romanNumeral = "";
        if (arabicNumber == 4) {
            return "IV";
        }
        if (arabicNumber < 5) {
            for (int i = 0; i < arabicNumber; i++) {
                romanNumeral += "I";
            }
            return romanNumeral;
        }
        romanNumeral += "V";
        if (arabicNumber - 5 > 0) {
            for (int i = 0; i < arabicNumber - 5; i++) {
                romanNumeral += "I";
            }
        }
        return romanNumeral;
    }
}
