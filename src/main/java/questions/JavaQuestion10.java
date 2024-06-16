package questions;

import java.util.Arrays;
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
        boolean isOld = true;
        if(isOld){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


// 62. Write a Java program to convert an integer to binary format.
        convertBinary(5);


// 63. Create an array of 10 integers. Use a loop to populate it with numbers from 1 to 10.
        int pn[] = new int[]{2,4,6,8,3,5,10,11,9,12};
        int p = 1;
        int index = 0;
        for(int w: pn){
            pn[index] = w*p;
            p++;
            index++;

        }
        System.out.println(Arrays.toString(pn));
// 64. Write a method that takes an ArrayList of integers and returns the sum of its elements.


    }

    public static void convertBinary(int a){
        System.out.println("integer converted to Binary: " + Integer.toBinaryString(a));
    }


    public static void concatenatedOfTwoString(String a, String b){
        System.out.println(a+b);
    }
}
