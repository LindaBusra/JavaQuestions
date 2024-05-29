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
        String day = "Monday";
        switch (day.toLowerCase()){
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Working Day");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Holiday");
                break;
            default:
                System.out.println("Enter a valid day please");
        }



// 33. Write a program that takes a List of integers and finds the second largest number in the List.
        int nums[] = new int[]{7, 8, 5, 14, 9, 2, 3,21 };
        Arrays.sort(nums);
        System.out.println(nums[nums.length-2]);

        
// 34. Declare a boolean array and use a loop to set all its elements to true.
        int n = 5;
        boolean newArr[] = new boolean[n];

        for(int i=0; i<n; i++){
            newArr[i] = true;
        }

        System.out.println(Arrays.toString(newArr));



// 35. Write a Java program that prints the Fibonacci sequence up to a given number.

        int maxNumber = 50;

        int a = 0;  // First number of the sequence
        int b = 1;  // Second number of the sequence
        System.out.print("Fibonacci: " + a + " " + b);

        // Generate the next numbers in the sequence
        int next = a + b;
        while (next <= maxNumber) {
            System.out.print(" " + next);
            a = b;
            b = next;
            next = a + b;  // Sum of the last two numbers
        }


    }
}
