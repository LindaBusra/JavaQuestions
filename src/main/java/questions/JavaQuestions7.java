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


// 44. Declare a two-dimensional array of integers and initialize it with values. Print the diagonals of the array.
        // 3x3 from left to rigt [0][0], [1][1], ve [2][2]   and from right to left [0][2], [1][1], ve [2][0]
        int[][] multarr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        System.out.println("Print the diagonals of the array from left to right");
        for(int i=0; i<multarr.length; i++){
            System.out.println(multarr[i][i]+ " ");
        }

        System.out.println("Print the diagonals of the array from right to left");
        for(int i=0; i<multarr.length; i++){
            System.out.println(multarr[i][multarr.length-1-i ] + " ");
        }


// 45. Write a method that takes an integer array and returns a new array with each element
        int nums[] = new int[]{7,8,9,7,3,5};

        int newArr[] = new int[1];
        System.out.println("Returns a new array with each element:");
        for(int w : nums){
            newArr[0] =w;
            System.out.println(Arrays.toString(newArr));
        }



// 46. Write a Java program that prints all prime numbers between 1 and 100.

        System.out.println("all prime numbers between 1 and 100:");

    for(int num=2; num<101; num++) {

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num);
        }
    }


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
