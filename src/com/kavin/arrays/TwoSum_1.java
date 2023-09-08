package com.kavin.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {

    public static void main (String[] args) {
        TwoSum_1 twoSum = new TwoSum_1 ();
        int[] input = {2, 3, 5, 6, 11, -1, 9};
        int[] resultIndexes = twoSum.twoSum (input, 10);
        System.out.println (Arrays.toString (resultIndexes));
    }

    public int[] twoSum (int[] nums, int target) {
        // key -> complement(difference from target) : value -> index
        Map<Integer, Integer> cache = new HashMap<> ();
        for (int i = 0; i < nums.length; i++) {
            if (cache.get (nums[i]) != null)
                return new int[]{cache.get (nums[i]), i};
            cache.put (target - nums[i], i);
        }
        return nums;
    }

    @SuppressWarnings("unused")
    public int[] twoSumSlow (int[] nums, int target) {
        for (int i = 0; i < nums.length; i++)
            for (int j = i + 1; j < nums.length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return nums;
    }
}
