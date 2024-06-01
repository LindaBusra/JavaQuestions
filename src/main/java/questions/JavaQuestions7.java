package questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

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
        int arr[] = new int[]{1,5,6,8,7,9,10,12};
        for(int w: arr){
            System.out.println(w);
        }


// 43. Write a Java program that asks the user for 5 numbers, stores them in an array, and prints the highest number.
        int numbers[] = new int[5];
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<5; i++) {
            System.out.println("Enter "+(i+1)+". number please: ");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The numbers : " + Arrays.toString(numbers));
        int max = Integer.MIN_VALUE;
        for(int w : numbers){
            if(w>max){
                max=w;
            }
        }
        System.out.println("The max number from array : " + max);



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
