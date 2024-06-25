package questions;

public class JavaQuestions12 {

    public static void main(String[] args) {

// 73. Create a switch-case statement that converts numbers 1-5 into their respective names as strings.

        int num = 5;
        switch (num){
            case 1 :
                System.out.println("one");
                break;
            case 2 :
                System.out.println("two");
                break;
            case 3 :
                System.out.println("three");
                break;
            case 4 :
                System.out.println("four");
                break;
            case 5 :
                System.out.println("five");
                break;
        }


// 74. Write a Java program that prints the first 10 numbers of the Fibonacci series using iteration.

        int n = 10;  // Number of terms to display
        int firstTerm = 0;
        int secondTerm = 1;

        System.out.println("First " + n + " terms of the Fibonacci series:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

// 75. Initialize a two-dimensional array of integers, fill it with numbers, and print the largest number found in the array.


    }
}
