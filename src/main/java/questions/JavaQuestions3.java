package questions;

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


    }
}
