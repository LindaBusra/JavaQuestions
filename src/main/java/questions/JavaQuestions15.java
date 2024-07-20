package questions;

import java.util.Scanner;

public class JavaQuestions15 {

    public static void main(String[] args) {


// 91. Initialize a string "Java is fun" and use the replace method to change "fun" to "powerful".
        String str = "Java is fun";
        str = str.replaceAll("fun", "powerful");
        System.out.println(str);


// 92. Write a Java program to replace vowels in a string with asterisks '*'.
        str = str.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(str);


// 93. Create a method that replaces the last character of a string with the character 'z'.
        replaceVowels("Character of a string", "z");


// 94. Write a Java program that asks the user for a sentence and a word to replace, and a word with which to replace it, then performs the replacement.
        replaceWordWithAnotherWord();

// 95. Initialize a string "2024-05-07" and replace the hyphens with slashes '/'.
        String date = "2024-05-07";
        date = date.replaceAll("-", "/");
        System.out.println(date);


// 96. Write a method to replace the first three letters of a string with "XYZ".
        replaceFirstThreeLetters("it is a new day today");

    }

    private static  void replaceFirstThreeLetters(String x){
        String newTekst =  "XYZ" +  x.substring(3);
        System.out.println(newTekst);
    }


    public static void replaceVowels(String str, String x){
        str = str.replaceAll("[aeiouAEIOU]", "x");
        System.out.println(str);
    }

    public static void replaceWordWithAnotherWord(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence please");
        String str = scanner.nextLine();
        System.out.println("Enter your word do you want to replace");
        String word = scanner.nextLine();
        System.out.println("Enter your word do you want to replace with");
        String word2 = scanner.nextLine();
        str = str.replaceAll(word, word2);
        System.out.println(str);

    }
}
