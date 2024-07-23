package questions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class JavaQuestions16 {
    public static void main(String[] args) {


// 97. Create a string "Error 404: Not Found". Use replace to change "404" to "500".
        String txt = "Error 404: Not Found";
        txt = txt.replaceAll("404", "500");
        System.out.println(txt);


// 98. Write a program that replaces all occurrences of the word "error" with "warning" in a log message.
        replaceWord("Error is error");


// 99. Write a Java program to calculate the number of days between two dates.
        LocalDate localDate1 = LocalDate.of(2024,7,21);
        LocalDate localDate2 = LocalDate.of(2024,5,1);
        System.out.println(numberOfDays(localDate1, localDate2));


// 100. Create a method that prints the name of the day (like Monday, Tuesday, etc.) for a given date.
        LocalDate date = LocalDate.of(2024, 07, 22);
        System.out.println(date.getDayOfWeek());
// 101. Write a program that adds 30 days to the current date and prints the resulting date.


    }
    private static void replaceWord(String str){
        str = str.toLowerCase().replaceAll("error", "warning");
        System.out.println(str);
    }

    private static long numberOfDays(LocalDate date1, LocalDate date2){
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
