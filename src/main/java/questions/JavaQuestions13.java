package questions;

import java.util.Scanner;

public class JavaQuestions13 {
    public static void main(String[] args) {

// 77. Write a Java program that asks the user for their age and prints whether they are a minor (under 18) or an adult.
        System.out.println("Enter your age please: ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if(age<18){
            System.out.println("Minor");
        } else if (age>=18){
            System.out.println("Adult");
        } else {
            System.out.println("Invalid input!");
        }
// 78. Declare an array of chars and use a for-each loop to print each character.
// 79. Create a List of doubles, add some values and then use a loop to calculate the sum of all elements.
// 80. Write a program that checks if a string contains another string (substring).
// 81. Initialize an integer array with random numbers and find the second smallest number.


    }
}