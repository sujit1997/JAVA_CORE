package Six_Part_A_LinearSearch;

public class linearSearch_04_MinNu_In_Range {
    public static void main(String[] args) {
    int [] arr = {63,86,42,84,31,74,63,-4,256};
        //System.out.println(min(arr));
        System.out.println(minNumInRange(arr,1,5));
    }
    //assume arr.length !=0
    // below function give minimum number from array
//    static int min(int [] arr){
//    int ans = arr[0];
//    for(int i=1;i<arr.length;i++){
//        if(arr[i] < ans){
//            ans = arr[i];
//        }
//    }
//    return ans;
//    }
    // below code give minimum number from provided range in array

    static int minNumInRange(int [] arr, int start,int end){
       int min = arr[start];
        for(int index = start; index<end;index++){
            if(index < min){
                min =arr[index];
            }
        }
        return min;
    }

}
