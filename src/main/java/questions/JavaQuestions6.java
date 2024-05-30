package questions;

import java.util.Arrays;

public class JavaQuestions6 {
    public static void main(String[] args) {

// 36. Create a method that accepts an ArrayList of integers and reverses its elements.
        int arr[] = new int[]{2,5,7,8,9,0};
        reverseArray(arr);


// 37. Write a method that takes two integers and returns the sum, difference, and product as a List of integers.

    sumDiffrenceProdukt(7, 9);


    }

    public static void reverseArray(int[] arr){

        int temp[] = new int[arr.length];
        int index = 0;
        for(int i=arr.length-1; i>=0;i--){
            temp[index] = arr[i];
            index++;
        }
        System.out.println(Arrays.toString(temp));
    }

    public static void sumDiffrenceProdukt(int a, int b){
        System.out.println("sum: " + (a+b));
        System.out.println("difference: " + Math.abs(a-b));
        System.out.println("product: " + (a*b));
    }
}
