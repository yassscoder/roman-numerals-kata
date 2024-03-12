import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class RomanNumerals {

    public static String convert(int arabicNumber) {
        SortedMap<Integer, String> numbersDictionary = new TreeMap<>(Map.ofEntries(
                Map.entry(1, "I"),
                Map.entry(4, "IV"),
                Map.entry(5, "V"),
                Map.entry(9, "IX"),
                Map.entry(10, "X")
        ));
        if (numbersDictionary.containsKey(arabicNumber)) {
            return numbersDictionary.get(arabicNumber);
        }
        StringBuilder romanNumeral = new StringBuilder();
        int numberBuffer = arabicNumber;
        if (arabicNumber >= 5) {
            romanNumeral.append("V");
            numberBuffer -= 5;
        }
        for (int i = 0; i < numberBuffer; i++) {
            romanNumeral.append("I");
        }
        return romanNumeral.toString();
    }
}
