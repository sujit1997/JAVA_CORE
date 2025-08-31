package Six_Part_A_LinearSearch;

import java.util.Arrays;

public class linearSearch_06_Max_In_2D_Array {
    public static void main(String[] args) {
        int[][] cake = {
                {36,41,85},
                {74,36,41},
                {96,14,85}
        };
        int max;
        System.out.println(max(cake));
    }
    static int max(int [][] cake){
        int max = Integer.MIN_VALUE;
        for (int row = 0; row <cake.length;row++){
            for(int col = 0; col<cake[row].length; col++){
                if(cake[row][col] > max){
                max = cake[row][col];
                }
            }
        }
        return max;
    }

}
