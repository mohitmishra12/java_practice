import java.util.HashMap;
import java.util.Map;

class floodwater {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;

        int[] next = new int[n + 1];
        for (int i = 0; i <= n; ++i) {
            next[i] = i;
        }
        Map<Integer, Integer> lakeToLastRainMap = new HashMap<>();
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            if (rains[i] == 0) {
                res[i] = 1;
                continue;
            }
            next[i] = i + 1;
            if (lakeToLastRainMap.containsKey(rains[i])) {
                int j = find(next, lakeToLastRainMap.get(rains[i]));
                if (j > i) {
                    return new int[0];
                }
                res[j] = rains[i];
            }
            res[i] = -1;
            lakeToLastRainMap.put(rains[i], i);
        }

        return res;
    }

    private int find(int[] next, int i) {
        int j = i;
        if (next[i] != i) {
            j = find(next, next[i]);
        }
        next[i] = j + 1;
        return j;
    }
}