package questions;

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
