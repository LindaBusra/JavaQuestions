package questions;

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
// 94. Write a Java program that asks the user for a sentence and a word to replace, and a word with which to replace it, then performs the replacement.
// 95. Initialize a string "2024-05-07" and replace the hyphens with slashes '/'.
// 96. Write a method to replace the first three letters of a string with "XYZ".
    }
}
