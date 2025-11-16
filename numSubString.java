class numSubString {
    public int numSub(String s) {
        int MOD = (int)Math.pow(10, 9) + 7;


        int total_count = 0;
        int current_count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '1') {
                current_count += 1;
            } else {
                current_count = 0;
            }

            total_count = (total_count + current_count) % MOD;
        }

        return total_count;
    }
}