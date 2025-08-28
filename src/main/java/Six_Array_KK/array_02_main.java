package Six_Array_KK;


import java.util.Arrays;
import java.util.Scanner;

public class array_02_main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        arr[0] = 45;
        arr[1] = 450;
        arr[2] = 4500;
        arr[3] = 45000;
        arr[4] = 450000;
        //System.out.println(arr[4]);

        // input using for loops
//        for(int i=0; i<arr.length;i++){
//            arr[i] = in.nextInt();
//        }
//        for(int i=0; i<arr.length;i++){
//            System.out.println(arr[i] + " ");
//        }

        // for each loop
//        for(int num: arr){              //for every element in array, print the element
//            System.out.println(num);    //here num represent element of the array
//        }

        // Convert array into String and print
        //System.out.println(Arrays.toString(arr));


        // Array of object
//        String[] str = new String[4];
//        for (int i=0; i<str.length;i++){
//            str[i] = in.next();
//        }
//        System.out.println(Arrays.toString(str));

        // modify array
        String[] name = new String[3];
        for(int i=0;i<name.length;i++){
            name[i] = in.next();
        }
        name[1] = "sujit";
        System.out.println(Arrays.toString(name));
    }
}

