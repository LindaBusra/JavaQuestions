package questions;

public class JavaQuestions2 {
    public static void main(String[] args) {

// 7. Write a Java program to find the index of an element in an integer array.




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
