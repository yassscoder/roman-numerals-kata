import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {
    private static final SortedMap<Integer, String> numbersDictionary = new TreeMap<>(Map.ofEntries(
            Map.entry(1, "I"),
            Map.entry(4, "IV"),
            Map.entry(5, "V"),
            Map.entry(9, "IX"),
            Map.entry(10, "X"),
            Map.entry(40, "XL"),
            Map.entry(50, "L"),
            Map.entry(90, "XC")
    )).descendingMap();

    public static String convert(int arabicNumber) {
        StringBuilder romanNumeral = new StringBuilder();
        int numberBuffer = arabicNumber;
        for (Integer key : numbersDictionary.keySet()) {
            while (numberBuffer >= key) {
                romanNumeral.append(numbersDictionary.get(key));
                numberBuffer -= key;
            }
        }
        return romanNumeral.toString();
    }
}
