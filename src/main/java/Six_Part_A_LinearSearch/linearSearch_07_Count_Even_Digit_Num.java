package Six_Part_A_LinearSearch;

public class linearSearch_07_Count_Even_Digit_Num {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};
        //System.out.println(findnumber(nums));
        System.out.println(digits(0));
    }
    static int findnumber(int [] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    // function to check whether a number to contains even digits or not
      static boolean even(int num) {
          int numberOfDigits = digits(num);
          return numberOfDigits % 2 == 0;
      }

    // Count number of digit in a number
    static int digits(int num){
        if(num<0){
            num = num * -1;
        }
        if(num ==0){
            return 1;
        }
        int count = 0;

        while(num>0){
            count++;
            num = num /10; //num /=10
    }
        return count;
}
}