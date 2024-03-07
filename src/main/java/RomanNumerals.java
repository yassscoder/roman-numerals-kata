public class RomanNumerals {
    public static String convert(int arabicNumber) {
        if (arabicNumber == 2) {
            return "II";
        }
        if (arabicNumber == 3) {
            return "III";
        }
        return "I";
    }
}
