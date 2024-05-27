package questions;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions4 {
    public static void main(String[] args) {


// 23. Write a program using an if-else statement to print "Adult" if age is greater than 18, otherwise print "Child".
        int age = 20;
        if(age>18){
            System.out.println("Adult");
        } else {
            System.out.println("Child");
        }
// 24. Initialize a List of Strings with duplicate values. Write a method to remove duplicates from the List.
        List<String> list = new ArrayList<>();
        list.add("Ole");
        list.add("Mark");
        list.add("Ole");
        list.add("Jenny");
        list.add("Nils");
        list.add("Jake");
        list.add("Jenny");

        List<String> newList = new ArrayList<>();
        for(String w : list){
            if(!newList.contains(w)){
                newList.add(w);
            }
        }
        System.out.println(newList);

// 25. Write a for loop to print even numbers from 1 to 50.
        for(int i =1; i<51; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();

// 26. Create a method that takes two parameters: an array of integers and a number. The method should print whether the number is found in the array or not.
        int arr[] = new int[]{1,5,9,12,45,76,87};
        boolean isInTheArray = isInTheArray(arr, 12);
        System.out.println(isInTheArray);


// 27. Write a Java program that calculates the factorial of a number using recursion.
        int number = 5; // You can change this number to calculate a different factorial
        long result = factorial(number);
        System.out.println("Factorial of " + number + " is " + result);



// 28. Declare an array of integers and find the smallest number in the array.
        int num[] = new int[]{7, 3, 45, 21, 4, 56, 4};
        int min = Integer.MAX_VALUE;

        for(int w : num){
            if(w<min){
                min = w;
            }
        }
        System.out.println("the min value in the array; " + min);


// 29. Create a method that takes a string and returns the number of times the character 'a' appears in the string.
        System.out.println(howManyTimes("Character", "a"));
        String word = "Program";   String expected = "a";
        System.out.println(howManyTimes(word, expected));



// 30. Write a Java program that takes a string input from the user and prints it back in upper case.
        String forReverse = "Character";
        System.out.println(reverseToUpperCase(forReverse));


    }

    public static String reverseToUpperCase(String str){

        String arr[] = str.split("");
        String newText = "";
        for(int i=arr.length-1; i>=0; i--){
            newText += arr[i].toUpperCase();
        }
        return newText;
    }

    public static int howManyTimes(String x, String a){
        int count = 0;
        String arr[] = x.split("");
        for(int i=0; i<arr.length; i++){
            if(arr[i].equals(a)){
                count++;
            }
        }
        return count;
    }
    public static boolean isInTheArray(int arr[], int x){
        boolean flag = false;
        for(int w: arr){
            if(w==x){
                flag = true;
                break;
            }
        }
        return flag;
    }


    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        // Recursive case: n! = n * (n-1)!
        else {
            return n * factorial(n - 1);
        }
    }

}