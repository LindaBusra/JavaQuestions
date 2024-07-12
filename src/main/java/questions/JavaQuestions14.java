package questions;

import java.util.Arrays;
import java.util.Collections;

public class JavaQuestions14 {
    public static void main(String[] args) {



// 85. Declare a List of integers and find out if it contains a given number using a method.
        int []arr = new int[]{4,8,9,7,6,12,34,56,48,79};
        System.out.println(isContains(arr, 48));


// 86. Write a Java program that prints the characters from A to Z using a loop.
        for(char x='A'; x<='Z'; x++){
            System.out.print(x + " ");
        }


// 87. Create an array of Strings and use a method to sort it in descending order.
        String str[] =  new String[]{"Ole", "Jeny", "Mike", "John"};

        //ascending order
        Arrays.sort(str);
        System.out.println("in ascending order: " + Arrays.toString(str));

        //descending order
        Arrays.sort(str, Collections.reverseOrder());
        System.out.println("in descending order: " + Arrays.toString(str));


// 88. Initialize a variable of type long with a value
        long l = 1245879654123L;
        System.out.println(l);


// 89. Write a Java program to replace all occurrences of 'day' with 'night' in a given string.
// 90. Create a method that takes a string and replaces all spaces with underscores.

    }
    private static boolean isContains(int [] arr, int x){

        boolean flag = false;
        for(int w : arr){
            if(w==x){
                flag = true;
                break;
            }
        }
        return flag;

    }
}
