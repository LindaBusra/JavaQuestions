package questions;

public class JavaQuestions14 {
    public static void main(String[] args) {

// 85. Declare a List of integers and find out if it contains a given number using a method.
        int []arr = new int[]{4,8,9,7,6,12,34,56,48,79};
        System.out.println(isContains(arr, 48));


// 86. Write a Java program that prints the characters from A to Z using a loop.
// 87. Create an array of Strings and use a method to sort it in descending order.
// 88. Initialize a variable of type long with a value


    }
    private static boolean isContains(int [] arr, int x){

        boolean flag = false;
        for(int w : arr){
            if(w==x){
                flag = true;
                break;
            }
        }
        return flag;

    }
}
