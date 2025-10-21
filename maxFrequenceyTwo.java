class maxFrequenceyTwo {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int max = 0, min = Integer.MAX_VALUE;

        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        int[] freq = new int[max + 1];
        int[] prefix = new int[max + 1];
        for (int i : nums) {
            freq[i]++;
        }
        for (int i = min; i <= max; i++) {
            prefix[i] = prefix[i - 1] + freq[i];
        }
        int ans = 0;
        for (int i = min; i <= max; i++) {
            int low = 0;
            if (i - k - 1 > 0) {
                low = prefix[i - k - 1];
            }
            int high = 0;
            if (i + k <= max) {
                high = prefix[i + k];
            } else {
                high = prefix[max];
            }
            int toChange = high - low - freq[i];
            ans = Math.max(ans, freq[i] + (toChange >= numOperations ? numOperations : toChange));
        }
        return ans;
    }
}