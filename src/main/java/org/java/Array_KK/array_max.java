package org.java.Array_KK;

public class array_max {
    public static void main(String[] args) {
        int[] arr = {9, 7, 5, 4, 6, 23, 9, 1, 3};
        // System.out.println(max(arr)); // If you want acees max function for calling that function this line use
        System.out.println(maxrange(arr,0,8));
    }
    // 1) find Maximum value
//    static int max(int[] arr){   // Fuction max created here
//        int max = arr[0];
//        for(int i=1;i<arr.length;i++){
//            if(max<arr[i]){
//                max = arr[i];
//            }
//        }
//        return max;
//    }

    // 2)Find maximum value in particular range
    static  int maxrange(int[] arr, int start, int end){
        int maxval = arr[start];
        for (int i=start;i<=end;i++){
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
    return maxval;
    }


}
