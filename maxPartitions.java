class maxPartitions {
    public int maxPartitionsAfterOperations(String S, int k) {
        if(k == 26) return 1;
        char[] s = S.toCharArray();
        int n = s.length;
        int[] left1 = new int[n], left2 = new int[n];
        int[] partitions = new int[n];
        int mask1 = 0, mask2 = 0, count = 1;
        for(int i = 0; i < n; i++) {
            int filter = 1 << (s[i] - 'a');
            mask2 |= mask1 & filter;
            mask1 |= filter;
            if(Integer.bitCount(mask1) > k) {
                mask1 = filter;
                mask2 = 0;
                count++;
            }
            left1[i] = mask1;
            left2[i] = mask2;
            partitions[i] = count;
        }
        int ans = count;
        mask1 = mask2 = count = 0;
        for(int i = n - 1; i >= 0; i--) {
            int filter = 1 << (s[i] - 'a');
            mask2 |= mask1 & filter;
            mask1 |= filter;
            if(Integer.bitCount(mask1) > k) {
                mask1 = filter;
                mask2 = 0;
                count++;
            }
            if(Integer.bitCount(mask1) == k) {
                if((filter & mask2) != 0 && (filter & left2[i]) != 0 && Integer.bitCount(left1[i]) == k && (left1[i] | mask1) != (1 << 26) - 1) ans = Math.max(ans, count + partitions[i] + 2);
                else if(mask2 != 0) ans = Math.max(ans, count + partitions[i] + 1);
            }
        }
        return ans;
    }
}