class nextBeutyfulNumber {
    public int nextBeautifulNumber(int n) {
        int len = String.valueOf(n).length();
        for (int i = 0; i <= 6; i++) {
            counts[i]--;
            int res = dfs(i, len, n);
            if (res > 0)
                return res;
            counts[i]++;
        }
        return dfs(1, len, n);
    }

    int[] counts = { 0, 1, 2, 3, 4, 5, 6 };

    public int dfs(int num, int n, int lim) {
        if (n == 0) {
            if (num <= lim)
                return 0;
            for (int i = 1; i < counts.length; i++) {
                if (counts[i] != 0 && counts[i] != i)
                    return 0;
            }
            return num;
        }
        for (int i = 1; i <= 6; i++) {
            if (counts[i] > 0) {
                counts[i]--;
                int res = dfs(num * 10 + i, n - 1, lim);
                if (res > 0)
                    return res;
                counts[i]++;
            }
        }
        return 0;
    }
}