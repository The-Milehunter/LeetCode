package com.kavin.arrays;

import java.util.HashMap;
import java.util.Map;
@SuppressWarnings("unused")
public class TwoSum_1 {

    public int[] twoSum(int[] nums, int target) {
        // key -> complement(difference from target) : value -> index
        Map <Integer,Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (cache.get(nums[i]) != null)
                return new int[] {cache.get(nums[i]),i};
            cache.put(target-nums[i],i);
        }
        return nums;
    }
    public int[] twoSumSlow(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return nums;
    }
}
