package com.leetcode.smallestnumberwithallsetbits;

//https://leetcode.com/problems/smallest-number-with-all-set-bits
public class SmallestNumberWithAllSetBits {

    static void main() {

        Solution s = new Solution();
        System.out.println("Smallest number is: " + s.smallestNumber(4));

    }

    static class Solution {
        public int smallestNumber(int n) {
            int greaterThanEqualTo = 0;
            int lastResult = 0;

            for (int i = 0; i <= n; i++) {

                if (lastResult > n || n == 1) {
                    if (n == 1) {
                        greaterThanEqualTo = 1;
                    } else {
                        greaterThanEqualTo = (lastResult - 1);
                    }
                    break;
                }

                if (i == 0) {
                    lastResult = 1;
                } else {
                    lastResult = (2 * lastResult);
                }
            }

            return greaterThanEqualTo;
        }
    }

}
