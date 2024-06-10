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
// 55. Initialize an integer array. Use a for loop to print all elements that are divisible by 3.


    }
}
