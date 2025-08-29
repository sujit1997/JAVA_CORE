package Six_Part_A_LinearSearch;

import java.util.Arrays;

public class linearSearch_03_SearchInRange {
    public static void main(String[] args) {
        int[] arr = {5,7,9,3,4,12,63};
        int target = 14;
        System.out.println(searchInRage(arr,target,1,5));

    }
    static int searchInRage(int [] arr,int target, int start,int end){
        if(arr.length==0){
            return -1;
        }
        //run a loop
        for(int index=start; index<=end;index++){
           int element = arr[index];
           if(element == target){
               return index;
           }
        }
        return -1;
    }
}
