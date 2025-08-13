import java.util.HashMap;
import java.util.Map;

class NearByDublicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> d = new HashMap<>();

        for (int i = 0; i < nums.length; ++i){
            if (i - d.getOrDefault(nums[i], -1000000) <= k){
                return true;
            }
            d.put(nums[i], i);
        }
        return false;

    }
}
