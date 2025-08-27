package org.java.Array_KK;

public class array_01_input {
    public static void main(String[] args) {
        // store roll no
        int a = 5;

        // store name
        String name = "sujit";

        // ARRAY SYNTAX
        // datatype[] variable_name = new datatype[size];


//        // if we want to store multiple roll number
//        int[] rollnumber = new int[5];
//        // or
//        int[] rollnumber2 = {63,41,52,85,52};


        int[] ros; //declaration of array. ros is getting defined in stack
        ros = new int[5]; //initialization : actually here object is being created in the memory (heap memory)
        System.out.println(ros[0]);

    }
}
