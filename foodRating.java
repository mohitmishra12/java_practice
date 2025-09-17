import javafx.util.Pair;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class foodRating {
    private Map<String, TreeSet<Pair<Integer, String>>> d = new HashMap<>();
    private Map<String, Pair<Integer, String>> g = new HashMap<>();
    private final Comparator<Pair<Integer, String>> cmp = (a, b) -> {
        if (!a.getKey().equals(b.getKey())) {
            return b.getKey().compareTo(a.getKey());
        }
        return a.getValue().compareTo(b.getValue());
    };

    public foodRating(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; ++i) {
            String food = foods[i], cuisine = cuisines[i];
            int rating = ratings[i];
            d.computeIfAbsent(cuisine, k -> new TreeSet<>(cmp)).add(new Pair<>(rating, food));
            g.put(food, new Pair<>(rating, cuisine));
        }
    }

    public void changeRating(String food, int newRating) {
        Pair<Integer, String> old = g.get(food);
        int oldRating = old.getKey();
        String cuisine = old.getValue();
        g.put(food, new Pair<>(newRating, cuisine));
        d.get(cuisine).remove(new Pair<>(oldRating, food));
        d.get(cuisine).add(new Pair<>(newRating, food));
    }

    public String highestRated(String cuisine) {
        return d.get(cuisine).first().getValue();
    }
}
