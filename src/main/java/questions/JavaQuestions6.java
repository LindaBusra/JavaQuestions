package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaQuestions6 {
    public static void main(String[] args) {

// 36. Create a method that accepts an ArrayList of integers and reverses its elements.
        int arr[] = new int[]{2,5,7,8,9,0};
        reverseArray(arr);


// 37. Write a method that takes two integers and returns the sum, difference, and product as a List of integers.

    sumDiffrenceProdukt(7, 9);



// 38. Initialize a string with "Java Programming". Use a substring method to print "Programming".
        String text = "Java Programming";
        System.out.println(text.substring(5));


// 39. Write a program that uses nested loops to print a rectangle using '*' of size 5x10.

        for(int i=0; i<5; i++) {

            for(int j=0; j<10; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


// 40. Create a List of doubles and find the maximum and minimum values in the List.
        List<Double> list =  new ArrayList<>();
        list.add(5.6);
        list.add(2.6);
        list.add(3.4);
        list.add(1.8);
        list.add(9.3);
        list.add(5.1);
        list.add(8.5);

        double min = list.get(0);
        double max = list.get(0);

        for(double w : list){
            if(w>max){
                max = w;
            }

            if(w<min){
                min = w;
            }
        }

        System.out.println("max: " + max);
        System.out.println("min; " + min);
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
