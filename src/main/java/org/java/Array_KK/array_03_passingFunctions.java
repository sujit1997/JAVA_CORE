package org.java.Array_KK;

import java.util.Arrays;

public class array_03_passingFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 8, 2};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
        static void change(int[] arr){
            arr[0] = 99;
        }
    }
