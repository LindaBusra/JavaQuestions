package questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class JavaQuestions7 {
    public static void main(String[] args) {

// 41. Write a method that takes a List of strings and a string to search for, and returns true if the string exists in the List.
        List<String> list = new ArrayList<>();
        list.add("Ole");
        list.add("Mike");
        list.add("Jenny");
        list.add("Hans");
        list.add("Julie");

        System.out.println(isContains(list, "Ole"));
        System.out.println(isContains(list, "Jack"));


// 42. Create an integer array. Use a for-each loop to print each element.
// 43. Write a Java program that asks the user for 5 numbers, stores them in an array, and prints the highest number.



    }

    public static boolean isContains(List<String> list, String a){
        boolean flag = false;
        for (String w : list){
            if(w.equals(a)){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
