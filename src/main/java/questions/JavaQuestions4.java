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
// 28. Declare an array of integers and find the smallest number in the array.
// 29. Create a method that takes a string and returns the number of times the character 'a' appears in the string.
// 30. Write a Java program that takes a string input from the user and prints it back in upper case.







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
}
