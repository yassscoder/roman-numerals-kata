import java.util.Map;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        Map<Integer, String> numbersDictionary = Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(4, "IV"),
                Map.entry(5, "V"),
                Map.entry(9, "IX")
        );
        if (numbersDictionary.containsKey(arabicNumber)) {
            return numbersDictionary.get(arabicNumber);
        }
        StringBuilder romanNumeral = new StringBuilder();
        if (arabicNumber < 5) {
            for (int i = 0; i < arabicNumber; i++) {
                romanNumeral.append(numbersDictionary.get(1));
            }
        }
        if (arabicNumber - 5 > 0) {
            romanNumeral.append("V");
            for (int i = 0; i < arabicNumber - 5; i++) {
                romanNumeral.append(numbersDictionary.get(1));
            }
        }
        return romanNumeral.toString();
    }
}
