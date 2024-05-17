package questions;

import java.util.Arrays;

public class JavaQuestions2 {
    public static void main(String[] args) {

// 7. Write a Java program to find the index of an element in an integer array.

        int arr[] = new int[]{4,8,9,12,-6,5};
        int element = 14;
        int index = indexOfElementInArray(arr, element);
        if(index == -1){
            System.out.println(element + " does not exist in this array");
        } else {
            System.out.println("The index of " + element + " in the array: " + index);
        }


// 8. Declare and initialize a boolean variable. Use an if statement to print out "True" if true, otherwise print "False".
        boolean isYoung = false;
        if(isYoung){
            System.out.println("True");
        } else {
            System.out.println("False");
        }


// 9. Create a multidimensional array and access the second element of the first array.
        int multiarr[][] = {{2,3}, {8,9}, {9,3}, {-6, 5}};
        System.out.println(Arrays.deepToString(multiarr)); // Printing the whole array
        int secondElementOfFirstArray = multiarr[0][1]; // Accessing the second element of the first array
        System.out.println("Second element of the first array: " + secondElementOfFirstArray);


// 10. Write a Java program to reverse a string and print it.
        String text = "Hello World";
        for(int i=text.length()-1; i>=0; i--){
            System.out.print(text.charAt(i));
        }
    }





    public static int indexOfElementInArray(int[] arr, int x){
       for(int i=0; i<arr.length; i++){
           if(arr[i]==x){
               return i;
           }
       }
        return -1;  //if it does not exist

    }
}
