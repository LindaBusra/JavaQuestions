package questions;

import java.util.Arrays;
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
        char []arr =  new char[]{'a', 'b', 'c', 'd'};
        for(char w : arr){
            System.out.println(w + " ");
        }



// 79. Create a List of doubles, add some values and then use a loop to calculate the sum of all elements.
        double d[] = new double []{1.4, 5.8, 6.3, 7.5};
        double sum = 0;
        for(double w: d){
            sum += w;
        }
        System.out.println("sum: " + sum);


// 80. Write a program that checks if a string contains another string (substring).
        System.out.println(isContains("Hello world!", "world"));



// 81. Initialize an integer array with random numbers and find the second smallest number.
        int numbers[] = new int[] {1,36, 48,5,8,7,9,12};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("the second smallest number: " + numbers[1]);


// 82. Write a method that takes a List of integers and prints each integer to the power of itself (n^n).
        System.out.println(powerOfInteger(4));



// 83. Create a Java program that calculates and prints the result of the expression (a + b * c), where a, b, and c are taken as input from the user.

        System.out.println("enter three number please:");
        System.out.println("number1:");
        int num1 = scanner.nextInt();
        System.out.println("number1:");
        int num2 = scanner.nextInt();
        System.out.println("number1:");
        int num3 = scanner.nextInt();
        System.out.println("The result of the expression is: " + (num1 + (num2*num3)));

// 84. Initialize a string variable with a full sentence. Write a program that counts the number of commas in the sentence.
        String str = "Initialize, a string variable, with a full sentence";
        String str_arr[] = str.split("");
        int count = 0;
        for(String w: str_arr){
            if(w.equals(",")){
                count++;
            }
        }
        System.out.println("the number of commas: " + count);











    }

    public static int powerOfInteger(int a){
        int result = 1;
        for(int i=1; i<=a; i++){
            result = result*i;
        }

        return result;
    }



    public static boolean isContains(String str, String text){

        if(str.contains(text)){
            return true;
        } else{
            return false;
        }
    }
}
