package questions;

import java.util.LinkedList;

public class JavaQuestion10 {
    public static void main(String[] args) {

// 59. Declare an integer LinkedList, add elements to it and then print the first and last element.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(8);
        list.add(6);
        list.add(4);
        list.add(12);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());


// 60. Create a method that takes two strings and returns a concatenated version of them.
        concatenatedOfTwoString("Jack", "Nilsen");



// 61. Initialize a boolean variable with true. Use an if statement to check its value and print "YES" if true, otherwise print "NO".
// 62. Write a Java program to convert an integer to binary format.
// 63. Create an array of 10 integers. Use a loop to populate it with numbers from 1 to 10.
// 64. Write a method that takes an ArrayList of integers and returns the sum of its elements.


    }

    public static void concatenatedOfTwoString(String a, String b){
        System.out.println(a+b);
    }
}
