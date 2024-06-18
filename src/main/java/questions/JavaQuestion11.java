package questions;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestion11 {

    public static void main(String[] args) {

// 66. Write a Java program that reverses an integer and prints the result.
        System.out.println(reverseInteger(1345));


// 67. Create a string variable with a value. Write a loop that prints each character of the string on a new line.
        String greeting = "Hello World";
        String characters[] = greeting.split("");
        for(String a : characters ){
            System.out.println(a);
        }

// 68. Initialize a List of integers with some values. Write a method that prints the product of all elements in the List.
        List<Integer> integers = new ArrayList<>();
        integers.add(2);
        integers.add(3);
        integers.add(5);
        integers.add(7);
        integers.add(11);

        printProductOfList(integers);



// 69. Write a program using nested loops that prints a triangle pattern of '#' with a height of 5.
// 70. Create an array of booleans, 5 elements long, all initialized to false. Use a loop to change each element to true.


    }
    public static int reverseInteger(int a){
        String num = "";
        String nums[] = String.valueOf(a).split("");
        for(int i= nums.length-1; i>=0; i--){
            num += nums[i];
        }
        return Integer.valueOf(num);
    }

    public static void printProductOfList(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            System.out.println("List is empty or null.");
            return;
        }

        // Initialize product as 1
        int product = 1;

        for (int num : list) {
            product *= num;
        }

        // Print the product
        System.out.println("The product of all elements in the list is: " + product);
    }
}
