import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        SortedMap<Integer, String> numbersDictionary = new TreeMap<>(Map.ofEntries(
                Map.entry(10, "X"),
                Map.entry(9, "IX"),
                Map.entry(5, "V"),
                Map.entry(4, "IV"),
                Map.entry(1, "I")
        )).descendingMap();
        if (numbersDictionary.containsKey(arabicNumber)) {
            return numbersDictionary.get(arabicNumber);
        }
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
