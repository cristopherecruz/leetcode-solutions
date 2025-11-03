package com.leetcode.minimumtimetomakeropecolorful;

//https://leetcode.com/problems/minimum-time-to-make-rope-colorful
public class MinimumTimeToMakeRopeColorful {

    static void main() {

        Solution s = new Solution();
        System.out.println(s.minCost("abaac", new int[] {1, 2, 3, 4, 5}));

    }

    static class Solution {
        public int minCost(String colors, int[] neededTime) {
            int n = colors.length();
            int ans = 0;
            int maxInRun = neededTime[0];

            for (int i = 1; i < n; i++) {
                if (colors.charAt(i) == colors.charAt(i - 1)) {

                    ans += Math.min(neededTime[i], maxInRun);

                    maxInRun = Math.max(maxInRun, neededTime[i]);
                } else {
                    maxInRun = neededTime[i];
                }
            }
            return ans;
        }

    }

}
