import java.util.*;

public class MAxNm {
    int[] nums, xor, inTime, outTime;
    List<Integer>[] tree;
    int time = 0, totalXor;

    public int minimumScore(int[] nums, int[][] edges) {
        int n = nums.length;
        this.nums = nums;
        xor = new int[n];
        inTime = new int[n];
        outTime = new int[n];
        tree = new ArrayList[n];

        for (int i = 0; i < n; i++) tree[i] = new ArrayList<>();

        for (int[] e : edges) {
            tree[e[0]].add(e[1]);
            tree[e[1]].add(e[0]);
        }


        dfs(0, -1);
        totalXor = xor[0];

        int res = Integer.MAX_VALUE;


        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = i;
                int b = j;

                int x = xor[a], y = xor[b], z;

                if (isDescendant(a, b)) {

                    int temp = x;
                    x = x;
                    y = y ^ temp;
                    z = totalXor ^ y ^ x;
                } else if (isDescendant(b, a)) {

                    int temp = y;
                    y = y;
                    x = x ^ temp;
                    z = totalXor ^ y ^ x;
                } else {

                    z = totalXor ^ x ^ y;
                }

                int max = Math.max(x, Math.max(y, z));
                int min = Math.min(x, Math.min(y, z));
                res = Math.min(res, max - min);
            }
        }

        return res;
    }

    private void dfs(int node, int parent) {
        inTime[node] = time++;
        xor[node] = nums[node];
        for (int nei : tree[node]) {
            if (nei != parent) {
                dfs(nei, node);
                xor[node] ^= xor[nei];
            }
        }
        outTime[node] = time++;
    }

    private boolean isDescendant(int u, int v) {
        return inTime[v] <= inTime[u] && outTime[u] <= outTime[v];
    }
}

