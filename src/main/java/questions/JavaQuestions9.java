package questions;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class JavaQuestions9 {

    public static void main(String[] args) {

// 52. Declare a float variable with a value and print it rounded to two decimal places.

        float num = 7.8386F;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out.println(decimalFormat.format(num));

// 53. Create an ArrayList of Strings. Add some colors (as string elements) and then use a loop to print each color.
        List<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Purple");
        colors.add("Black");
        colors.add("White");
        for(String w :colors){
            System.out.println(w);
        }




// 54. Write a program that takes a string input and prints the number of words in the string.
        String text = "There is a lot of country in the world";
        System.out.println("The number of word in this sentence : " + numberOfWords(text));




// 55. Initialize an integer array. Use a for loop to print all elements that are divisible by 3.
        int arr[]  = new int[]{4,5,6,9,12,14,15,16,18,13,21,28,45};
        for(int w : arr){
            if(w%3==0){
                System.out.print(w + " ");
            }
        }
        System.out.println();


// 56. Write a method in Java that checks if a given string starts with the character 'S'.

        System.out.println(startWithGivenCharacter("Susanne", "S"));
        System.out.println(startWithGivenCharacter("Erik", "S"));


// 57. Create a HashMap where you store countries as keys and their capitals as values. Print all keys and values.
    }




    public static boolean startWithGivenCharacter(String text, String x){
        if(text.substring(0,1).equals(x)){
            return true;
        } else {
            return false;
        }
    }
    public static int numberOfWords(String text){

        String []arr = text.split(" ");
        return  arr.length;
    }
}
