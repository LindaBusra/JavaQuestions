package questions;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class JavaQuestions8 {
    public static void main(String[] args) {

// 47. Create a method that takes a List of integers and returns it with all duplicates removed.
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(25);
        list.add(52);
        list.add(5);
        list.add(52);
        list.add(51);
        list.add(53);
        System.out.println(removeDuplicateItemFromArray(list));


// 48. Initialize a String array with some values and use a loop to print each element.
        String arr[] = new String[]{"Ole", "Mark", "Jack", "Nils", "Jeny"};
        for(String w: arr){
            System.out.println(w);
        }


// 49. Write a program using a switch statement that prints the name of the month based on the number input (1 to 12).
        int month = 3;
        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
                break;
        }

// 50. Create a two-dimensional integer array and print the sum of each row in separate lines.
        int mlt[][] = {{1,2,3}, {4,5,6}, {7,8,9}};

        for(int i=0; i<mlt.length; i++){
            int sum = 0;
            for(int j=0; j<mlt[i].length; j++){
                sum += mlt[i][j];
            }
            System.out.println("the sum of " + (i+1) + ". row: " + sum);
        }


// 51. Write a Java program that allows a user to enter their favorite movies and stores them in a HashMap with the user's rating for each movie.

        HashMap<String,Double> movies = new HashMap<>();
        boolean flag = true;
        int count = 1;

        while(flag){
            System.out.println("Enter your favorite "+ count+". movie please: ");
            count++;
            Scanner scanner = new Scanner(System.in);
            String movie1 = scanner.nextLine();
            System.out.println("Enter your rating from 0-10 for this movie please: ");
            Double range1 = scanner.nextDouble();
            movies.put(movie1, range1);
            boolean yesNo = false;
            do{
                System.out.println("If you continue enter: \"Yes\",  If you wil stop enter \"No\"");
                String continueOrStop = scanner.next();
                if (continueOrStop.toLowerCase().equals("yes")){
                    flag = true;
                    yesNo = false;
                } else if (continueOrStop.toLowerCase().equals("no")) {
                    flag = false;
                    break;
                } else {
                    System.out.println("Please enter Yes or No");
                    yesNo = true;
                }
            } while(yesNo);

        }

        System.out.println("Your favorite movies and their ranges: " + movies);

    }

    public static List<Integer> removeDuplicateItemFromArray(List<Integer> list){

        List<Integer> newList = new ArrayList<>();
        for(int w: list){
            if(!newList.contains(w)){
                newList.add(w);
            }
        }
        return newList;
    }
}
