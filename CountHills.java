class CountHills {
    public int countHillValley(int[] nums) {

        int count = 0;


        for (int currentIndex = 1, previousIndex = 0; currentIndex < nums.length - 1; ++currentIndex) {


            if (nums[currentIndex] == nums[currentIndex + 1]) {
                continue;
            }


            if (nums[currentIndex] > nums[previousIndex] && nums[currentIndex] > nums[currentIndex + 1]) {
                count++;
            }


            if (nums[currentIndex] < nums[previousIndex] && nums[currentIndex] < nums[currentIndex + 1]) {
                count++;
            }


            previousIndex = currentIndex;
        }

        return count;
    }
}
