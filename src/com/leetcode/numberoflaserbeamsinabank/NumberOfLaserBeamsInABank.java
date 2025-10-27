package com.leetcode.numberoflaserbeamsinabank;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/number-of-laser-beams-in-a-bank
public class NumberOfLaserBeamsInABank {

    static void main() {

        //String[] array = {"011001", "000000", "010100", "001000"};
        //String[] array = {"000", "111", "000"};
        String[] array = {"1", "1"};

        Solution s = new Solution();
        System.out.println("Number Of Beams: " + s.numberOfBeams(array));
    }

    static class Solution {
        public int numberOfBeams(String[] bank) {

            Map<Integer, Integer> sd = new HashMap<>();
            int beams = 0;

            for (int i = 0; i < bank.length; i++) {
                int devices = 1;
                for (int j = 0; j < bank[i].length(); j++) {
                    if (bank[i].charAt(j) == '1') {
                        sd.put(i, devices++);
                    }
                }
            }

            int anterior = 0;
            for (Map.Entry<Integer, Integer> entry : sd.entrySet()) {
                if (anterior > 0) {
                    beams += entry.getValue() * anterior;
                }
                anterior = entry.getValue();
            }

            return beams;
        }
    }

}
