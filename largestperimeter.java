import java.util.Arrays;

class largestperimeter {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);


        for (int i = nums.length - 1; i >= 2; i--) {

            int sumOfTwoSmallerSides = nums[i - 1] + nums[i - 2];

            if (sumOfTwoSmallerSides > nums[i]) {
                return sumOfTwoSmallerSides + nums[i];
            }
        }

        return 0;
    }
}
