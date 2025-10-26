package com.leetcode.calculatemoneyinleetcodebank;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/calculate-money-in-leetcode-bank/
public class CalculateMoneyInLeetcodeBank {

    static void main() {

        Solution obj = new Solution();
        int param_1 = obj.totalMoney(4);
        int param_2 = obj.totalMoney(10);
        int param_3 = obj.totalMoney(20);

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);
    }

    static class Solution {
        public int totalMoney(int n) {
            int weekAmount = 1;
            int monday = 0;
            List<Integer> output = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (monday == 7) {
                    monday = 0;
                    weekAmount++;
                }

                if (output.isEmpty() || monday == 0) {
                    output.add(weekAmount);
                    monday++;
                } else {
                    int valorAnterior = output.get(i-1);
                    output.add(valorAnterior + 1);
                    monday++;
                }
            }

            return output.stream().mapToInt(Integer::intValue).sum();
        }
    }

}
