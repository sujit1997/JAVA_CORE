package Six_Array_KK;

import java.util.ArrayList;

public class array_05_ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(67);
        list.add(68);
        list.add(69);
        list.add(70);
        list.add(71);
        list.add(72);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);list.add(67);list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        System.out.println(list);

        // for check item is present in arraylist or not
        //System.out.println(list.contains(67));

        // change or set a number to particular location
//        list.set(0,55);
//        System.out.println(list);

        // for remove a number from particular number
        list.remove(2);
        System.out.println(list);
    }
}
