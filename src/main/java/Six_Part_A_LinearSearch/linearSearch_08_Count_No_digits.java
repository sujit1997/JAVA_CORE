package Six_Part_A_LinearSearch;

public class linearSearch_08_Count_No_digits {
    public static void main(String[] args) {
        System.out.println(digits(-45265));
    }
    // Shortcut to count digit
    static int digits(int num){
        if(num == 0) return 1; // Special case
        num = Math.abs(num); // handle negative
        return (int)(Math.log10(num))+1;
    }
}
