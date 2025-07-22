import java.util.HashSet;
import java.util.Set;

class maxArray {
    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> set = new HashSet<>();

        int start = 0 ,end =0;
        int currSum = 0;
        int maxSum = 0;

        while (end<nums.length){
            if (!set.contains(nums[end])) {
                set.add(nums[end]);
                currSum += nums[end];
                maxSum = Math.max(maxSum, currSum);
                end++;

            } else {

                set.remove(nums[start]);
                currSum -= nums[start];
                start++;
            }
        }

        return maxSum;




    }
}