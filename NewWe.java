import java.util.*;

class NewWe {
    public int[] processQueries(int c, int[][] connections, int[][] queries) {

        int[] parent = new int[c + 1];
        int[] rank = new int[c + 1];


        for (int i = 1; i <= c; i++) parent[i] = i;

        // Find
        java.util.function.IntUnaryOperator find = new java.util.function.IntUnaryOperator() {
            public int applyAsInt(int x) {
                while (x != parent[x]) {
                    parent[x] = parent[parent[x]];
                    x = parent[x];
                }
                return x;
            }
        };

        // Union
        java.util.function.BiConsumer<Integer, Integer> union = (a, b) -> {
            int pa = find.applyAsInt(a);
            int pb = find.applyAsInt(b);

            if (pa != pb) {
                if (rank[pa] < rank[pb]) parent[pa] = pb;

                else if (rank[pb] < rank[pa]) parent[pb] = pa;
                else { parent[pb] = pa; rank[pa]++; }
            }
        };



        for (int[] edge : connections) union.accept(edge[0], edge[1]);


        Map<Integer, TreeSet<Integer>> compOnline = new HashMap<>();
        for (int i = 1; i <= c; i++) {
            int root = find.applyAsInt(i);
            compOnline.putIfAbsent(root, new TreeSet<>());
            compOnline.get(root).add(i);
        }

        boolean[] offline = new boolean[c + 1];
        List<Integer> ans = new ArrayList<>();

        for (int[] q : queries) {
            int type = q[0], x = q[1];

            if (type == 1) {
                // Query
                if (!offline[x]) {
                    ans.add(x);
                } else {
                    int root = find.applyAsInt(x);
                    TreeSet<Integer> set = compOnline.get(root);
                    if (set == null || set.isEmpty()) ans.add(-1);
                    else ans.add(set.first());
                }
            } else {

                if (!offline[x]) {
                    offline[x] = true;
                    int root = find.applyAsInt(x);
                    compOnline.get(root).remove(x);
                }
            }
        }

        // Convert to array
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) res[i] = ans.get(i);
        return res;
    }
}
