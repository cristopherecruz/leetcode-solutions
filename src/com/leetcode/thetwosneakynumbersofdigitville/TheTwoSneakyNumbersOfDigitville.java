package com.leetcode.thetwosneakynumbersofdigitville;

import java.util.Arrays;

//https://leetcode.com/problems/the-two-sneaky-numbers-of-digitville
public class TheTwoSneakyNumbersOfDigitville {

    static void main() {


        Solution sol = new Solution();
        //System.out.println(Arrays.toString(sol.getSneakyNumbers(new int[]{0, 1, 1, 0})));
        //System.out.println(Arrays.toString(sol.getSneakyNumbers(new int[]{0, 3, 2, 1, 3, 2})));
        //System.out.println(Arrays.toString(sol.getSneakyNumbers(new int[]{7, 1, 5, 4, 3, 4, 6, 0, 9, 5, 8, 2})));
        System.out.println(Arrays.toString(sol.getSneakyNumbers(new int[]{0, 0, 1, 1})));
    }

    static class Solution {
        public int[] getSneakyNumbers(int[] nums) {
            int[] result = new int[2];
            int leave = 0;
            int indice = 0;

            for (int i = 0; i < nums.length; i++) {
                if (leave == 2) {
                    break;
                }

                int times = howManyTimesHas(nums[i], nums);

                if (times == 2 && result[0] != nums[i]) {
                    result[indice++] = nums[i];
                    leave++;
                }
            }

            return result;
        }

        private int howManyTimesHas(int sneak, int[] nums) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (sneak == nums[i]) {
                    count++;
                }
            }
            return count;
        }

    }

}
