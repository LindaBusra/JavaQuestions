package questions;

import java.util.ArrayList;
import java.util.List;

public class JavaQuestions1 {
    public static void main(String[] args) {

// 1. Create a string array and find the longest element/elements in the array.

        String [] str = new String[]{"Hello", "World!", "Nice", "Beautiful", "Awesome", "Questions"};

        int max= 0;
        List<String> list = new ArrayList<>();

        for(String w : str){
            if(w.length()>max){
                max = w.length();
                list.clear();
                list.add(w);
            } else if(w.length()==max){
                list.add(w);
            }
        }

        System.out.println("longest element/elements: " );
        for(String w : list){
            System.out.println(w);
        }



// 2. Declare an integer variable and increment it by 10 using a shorthand operator.
        int a = 45;
        a += 10;
        System.out.println(a);




// 3. Write a Java program to check if an array contains a certain value.
        String str2[] = new String[]{"a", "b", "c", "d", "e"};
        String certainValue = "f";
        boolean flag = false;
        int count = 0;
        for(String w : str2){
            if(w.equals(certainValue)){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Array contains the certain value");
        } else {
            System.out.println("Array does not contain the certain value");
        }



// 4. Create a List of Strings and add five names into it. Print the List using a forEach loop.
        List<String> str3 = new ArrayList<>();
        str3.add("Ole");
        str3.add("Nils");
        str3.add("Martin");
        str3.add("Marie");
        str3.add("Elen");

        for(String w: str3){
            System.out.println(w);
        }



// 5. Initialize an array of integers and calculate the sum of all its elements.
        int nums[] = new int[]{1, 4, 6, 9, 12, 8};
        int sum = 0;
        for(int w: nums){
            sum += w;
        }

        System.out.println("The sum is: " + sum);




// 6. Create a method that takes an array of integers and returns the maximum value.

        int ab[] = new int[]{8,12,98,-8,75,3,81};
        System.out.println("max element of array" + maxElementFromArray(ab));
    }

    public static int maxElementFromArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int w : arr){
            if(w>=max){
                max = w;
            }
        }
        return max;
    }
}

