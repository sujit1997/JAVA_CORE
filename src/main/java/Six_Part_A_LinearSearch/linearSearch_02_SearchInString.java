package Six_Part_A_LinearSearch;

import java.util.Arrays;

public class linearSearch_02_SearchInString {
    public static void main(String[] args) {

        String name = "sujit";
        char target = 'a';

       // System.out.println(search(name, target));
        System.out.println(search2(name, target));
       // System.out.println(Arrays.toString(name.toCharArray())); //line give all character in array

    }
//    static boolean search(String str, char target){
//    if(str.length()==0){
//        return false;
//    }
//    for(int i=0;i<str.length();i++){
//        if(target == str.charAt(i)){
//            return true;
//        }
//    }
//    return false;
//    }

    // You can also use for each loop to find it
    static boolean search2(String str, char target){
        if(str.length()==0){
            return false;
        }
        // for each loop
        for(char ch : str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;

    }
}
