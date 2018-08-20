package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class L001_Two_Sum {

    public static int[] twoSum(int[] arr, int target) {
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
}