class MinmumSizeSubArray {


    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        long sum = 0;
        int minLength = n + 1;
        for (int end = 0, start = 0; end < n; ++end) {
            sum += nums[end];


            while (start < n && sum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= nums[start++];
            }
        }


        return minLength <= n ? minLength : 0;
    }
}
