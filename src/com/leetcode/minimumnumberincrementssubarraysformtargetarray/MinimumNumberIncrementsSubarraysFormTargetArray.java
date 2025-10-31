package com.leetcode.minimumnumberincrementssubarraysformtargetarray;

import java.util.Arrays;

//https://leetcode.com/problems/minimum-number-of-increments-on-subarrays-to-form-a-target-array
public class MinimumNumberIncrementsSubarraysFormTargetArray {

    static void main() {

        Solution s = new Solution();
        System.out.println(s.minNumberOperations(new int[]{1, 2, 3, 2, 1}));
        //System.out.println(s.minNumberOperations(new int[]{3, 1, 1, 2}));
        //System.out.println(s.minNumberOperations(new int[]{3, 1, 5, 4, 2}));
    }

    static class Solution {
        public int minNumberOperations(int[] target) {
            int n = target.length;
            int ans = target[0];
            for (int i = 1; i < n; ++i) {
                ans += Math.max(target[i] - target[i - 1], 0);
            }
            return ans;
        }
    }

}
