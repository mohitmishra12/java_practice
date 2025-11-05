import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class newActive {
    private int x;
    private long sum = 0L;
    private Map<Integer, Integer> freq;
    private final TreeSet<int[]> active = new TreeSet<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]), inactive = new TreeSet<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
    public long[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        this.x = x;
        freq = new HashMap<>(n);
        long[] ans = new long[n - k + 1];
        for(int i = 0; i < n; i++) {
            int count = freq.merge(nums[i], 1, Integer::sum);
            remove(count - 1, nums[i]);
            add(count, nums[i]);
            if(i + 1 >= k) {
                ans[i - k + 1] = sum;
                count = freq.merge(nums[i - k + 1], -1, Integer::sum);
                remove(count + 1, nums[i - k + 1]);
                add(count, nums[i - k + 1]);
            }
        }
        return ans;
    }

    private void add(int count, int num) {
        if(count == 0) return;
        int[] val = new int[] {count, num};
        if(active.size() < x) {
            active.add(val);
            sum += (long)count * num;
            return;
        }

        int[] temp = active.first();
        if(temp[0] > count || temp[0] == count && temp[1] >= num) {
            inactive.add(val);
            return;
        }
        sum += (long)count * num - (long)temp[0] * temp[1];
        inactive.add(active.pollFirst());
        active.add(val);
    }
    private void remove(int count, int num) {
        if(count == 0) return;
        int[] val = new int[] {count, num};
        if(inactive.contains(val)) {
            inactive.remove(val);
            return;
        }


        active.remove(val);
        sum -= (long)count * num;
        if(inactive.isEmpty()) return;

        int[] temp = inactive.pollLast();
        sum += (long)temp[0] * temp[1];
        active.add(temp);
    }

}
