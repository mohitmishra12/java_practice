class MinOperateer {
    public long minOperations(int[][] queries) {
        long res = 0;
        for (int[] query: queries) res += minOperations(query);
        return res;
    }

    public static long minOperations(int[] query) {
        long res0 = 0;
        long x = 1;
        while (x < query[0]) {
            res0 ++;
            x *= 4;
        }
        long res1 = res0;
        long res = 0;
        long prev = query[0];
        while (x <= query[1] * 4L) {
            res += res1 * (Math.min(x, query[1] + 1) - prev);
            prev = x;
            res1 ++;
            x *= 4;
        }
        return (res + 1) / 2;
    }
}