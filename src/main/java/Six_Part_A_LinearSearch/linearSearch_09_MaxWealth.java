package Six_Part_A_LinearSearch;
// https://leetcode.com/problems/richest-customer-wealth/
public class linearSearch_09_MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6}
        };
        linearSearch_09_MaxWealth obj = new linearSearch_09_MaxWealth();
        System.out.println("Maximum Wealth: " + obj.maximumWealth(accounts));
    }
    public int maximumWealth(int[][] accounts){
        //person == row
        //account = col
        int ans = Integer.MIN_VALUE;
         for(int person = 0; person< accounts.length; person++){
             // when you start a new col, take a new sum for that row
             int sum =0;
             for(int account = 0; account < accounts[person].length; account++){
                sum += accounts[person][account];
             }
            // now we have sum of accounts of person
             //check with overall answer
             if(sum>ans){
                 ans = sum;
             }
         }
         return ans;
    }
}
