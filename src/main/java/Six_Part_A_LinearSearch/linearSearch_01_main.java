package Six_Part_A_LinearSearch;

public class linearSearch_01_main {
    public static void main(String[] args) {
        int [] nums = {63,41,85,52,63,74,96,41,636};
        int target = 199;
        int ans = linearSearch(nums,target);
        System.out.println(ans);
    }
    // Search in the array : return the array if item found
    // otherwise if item not found return -1
    static int linearSearch(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }

        //run for loop
        for(int index=0;index<arr.length;index++){
        // check for element at every index if it is = target
            int element  = arr[index];
            if(element == target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}
