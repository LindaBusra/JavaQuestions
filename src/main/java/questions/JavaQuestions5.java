package questions;

import java.util.Arrays;
import java.util.Collections;

public class JavaQuestions5 {
    public static void main(String[] args) {

// 31. Initialize an array with several numbers. Write a method that returns the array sorted in descending order.
        Integer arr[] = new Integer[]{4,5,8,6,7,2,12,10,84};
        // Sort the array in ascending order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


// 32. Create a switch-case statement that prints "Working Day" for weekdays and "Holiday" for weekends.
// 33. Write a program that takes a List of integers and finds the second largest number in the List.
// 34. Declare a boolean array and use a loop to set all its elements to true.
// 35. Write a Java program that prints the Fibonacci sequence up to a given number.



    }
}
