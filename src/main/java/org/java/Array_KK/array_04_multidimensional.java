package org.java.Array_KK;

import java.util.Arrays;
import java.util.Scanner;

public class array_04_multidimensional {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       // int[][] arr = new int[3][];

//        int[][] arr ={
//                {1,2,3}, // 0th index
//                {4,5},     // 1th index
//                {6,7,8,9}   // 2nd index ->arr2D[2] = {6,7,8,9}
//                };

        int [][] arr = new int[3][3];
        //System.out.println(arr.length);// print number of rows
        //input
        for(int row = 0; row<arr.length;row++){
            for(int col = 0; col<arr[row].length; col++){
            arr[row][col] = in.nextInt();
            }
        }
        //output 1
//        for(int row = 0; row< arr.length;row++){
//            for(int col = 0; col<arr[row].length;col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

//        //output 2 same output by another for loop
//        for(int row= 0; row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //For each loop
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
