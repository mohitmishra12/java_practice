public class mejorty{


    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int slow = 2;

        for (int fast = 2; fast < nums.length; fast++) {

            if (nums[fast] != nums[slow - 2]) {
                nums[slow] = nums[fast];
                slow++;
            }
        }

        return slow;
    }


    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = removeDuplicates(nums);

        System.out.println("Length after removal: " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

