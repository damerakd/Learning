package LeetCode;

import java.util.HashMap;

public class NumIdenticalPairs {


    public int numIdenticalPairs(int[] nums) {
        int count = 0;

        HashMap<Integer, Integer> res = new HashMap<>(10);

        for (int i = 0; i < nums.length; i++) {

            if (!res.containsKey(nums[i])) {
                res.put(nums[i], 0);
            } else {
                res.put(nums[i], res.get(nums[i]) + 1);
                count += res.get(nums[i]);
            }
        }
        return count;
    }
}
