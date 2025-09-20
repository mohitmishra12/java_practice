import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

class splingsperrow {
    Set<String> words_perfect;
    Map<String, String> words_cap;
    Map<String, String> words_vow;

    public String[] spellchecker(String[] wordlist, String[] queries) {
        words_perfect = new HashSet<>();
        words_cap = new HashMap<>();
        words_vow = new HashMap<>();

        for (String word: wordlist) {
            words_perfect.add(word);

            String wordlow = word.toLowerCase();
            words_cap.putIfAbsent(wordlow, word);

            String wordlowDV = devowel(wordlow);
            words_vow.putIfAbsent(wordlowDV, word);
        }
        String[] ans = new String[queries.length];

        for (int i = 0; i < queries.length; i++) {
            ans[i] = solve(queries[i]);
        }

        return ans;
    }
    public String solve(String query) {
        if (words_perfect.contains(query))
            return query;

        String queryL = query.toLowerCase();
        if (words_cap.containsKey(queryL))
            return words_cap.get(queryL);

        String queryLV = devowel(queryL);
        if (words_vow.containsKey(queryLV))
            return words_vow.get(queryLV);

        return "";
    }

    public String devowel(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i< chars.length; i++) {
            if (isVowel(chars[i])) {
                chars[i] = '3';
            }
        }
        return new String(chars);
    }
    public boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
}
