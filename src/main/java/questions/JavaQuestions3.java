package questions;

import java.util.Arrays;
import java.util.HashMap;

public class JavaQuestions3 {
    public static void main(String[] args) {



// 14. Create a List of integers and use a forEach loop to multiply each element by 2.
        int arr[] = new int[]{8, 7, 12, 20, 31};
        for(int w : arr){
            System.out.println(w*2);
        }



// 15. Write a Java program to replace all occurrences of 'a' with 'e' in a string.
        String text = "Java program to replace all";
        text = text.replaceAll("a", "e");
        System.out.println("new text: " + text);


// 16. Create a HashMap to store the names of students and their corresponding grades.

        HashMap<String, Double> list = new HashMap<>();
        list.put("Ole", 5.9);
        list.put("Nils", 2.8);
        list.put("Mike", 5.8);
        list.put("Juli", 5.3);
        list.put("Jeny", 4.8);
        System.out.println(list);
        System.out.println(list.get("Ole"));


// 17. Write a program that prints the elements of an array in reverse order.
        int mylist[] = new int[]{7, 9, 12, 4, 5, 8};
        for(int i=mylist.length-1; i>=0; i--){
            System.out.print(mylist[i] + " ");
        }
        System.out.println();


// 18. Initialize a string with "hello world" and capitalize the first letter of each word.
        String str = "Hello world";
        String spltarr[] = str.split(" ");
        str = spltarr[0].substring(0,1).toUpperCase() + spltarr[0].substring(1) + " " + spltarr[1].substring(0,1).toUpperCase() + spltarr[1].substring(1) ;
        System.out.println(str);


// 19. Write a Java method that takes a string and returns the number of vowels in the string.
        String mytext[] = str.split("");
        int count = 0;

        for(String w : mytext){
            boolean isVowel = w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u") || w.equals("y") || w.equals("æ") || w.equals("ø");
            if(isVowel){
                count++;
            }
        }
        System.out.println("The number of vowels: " + count);


// 20. Create an integer variable, use a while loop to print it repeatedly, decrementing by 1 each time until it reaches 0.
        int a = 7;
        for(int i=a; i>=0; i--){
            System.out.print(i + " ");
        }
        System.out.println();


// 21. Write a method that takes an array of strings and sorts them in alphabetical order.
        String texts[] = new String[]{"Ole", "Jenny", "Mike", "James", "Elisabeth"};
        Arrays.sort(texts);
        System.out.println(Arrays.toString(texts));


// 22. Create a Java program that checks whether an integer is odd or even.
        int b = 13;
        if(b%2==0){
            System.out.println(b + " is even");
        } else {
            System.out.println(b + " is odd");
        }




    }
}
