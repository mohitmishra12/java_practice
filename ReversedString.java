import java.util.ArrayList;
import java.util.*;

class ReversedString {
    public String reverseWords(String s) {
        String[] wordsArray = s.trim().split("\\s+");
        List<String> wordsList = new ArrayList<String>(Arrays.asList(wordsArray));
        RevreseInteger Collections = null;
        Collections.reverse(wordsList);
        String reversed = String.join(" ", wordsList);
        return reversed;
    }
}
