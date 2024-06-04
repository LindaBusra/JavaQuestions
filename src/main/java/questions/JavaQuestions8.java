package questions;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions8 {
    public static void main(String[] args) {

// 47. Create a method that takes a List of integers and returns it with all duplicates removed.
// 48. Initialize a String array with some values and use a loop to print each element.
// 49. Write a program using a switch statement that prints the name of the month based on the number input (1 to 12).
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(25);
        list.add(52);
        list.add(5);
        list.add(52);
        list.add(51);
        list.add(53);
        System.out.println(removeDuplicateItemFromArray(list));


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
