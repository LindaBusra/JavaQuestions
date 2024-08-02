package questions;

import java.text.DateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaQuestions17 {
    public static void main(String[] args) {

// 107. Write a Java program to print the date of the previous Wednesday from today.
        LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek());  //sunday
        LocalDate previousWednesday = today;

        while(previousWednesday.getDayOfWeek() != DayOfWeek.WEDNESDAY) {
            previousWednesday = previousWednesday.minusDays(1);
        }

        System.out.println("Today is: " + today);
        System.out.println("Previous Wednesday was: " + previousWednesday);

// 108. Initialize a LocalDateTime object and convert it to a string in the format "YYYY-MM-DD HH:MM".
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD HH:MM");
        System.out.println(now.format(formatter));


// 109. Create a method to convert a string date from the format "YYYY-MM-DD" to "DD-MM-YYYY".
        String inputDate = "2023-08-01";
        String convertedDate = convertDateFormat(inputDate);
        System.out.println("Converted Date: " + convertedDate);


// 110. Write a Java program to find the day of the week for the first day of the current year.
        int currentYear = LocalDate.now().getYear();
        LocalDate firstDayOfYear = LocalDate.of(currentYear,1,1);

    }



    public static String convertDateFormat(String dateString) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(outputFormatter);
    }



// 111. Develop a method that takes a date and an integer N and returns the date N days after.
// 112. Create a Java program that calculates the number of weekdays between two dates.
// 113. Write a method that prints all the Thursdays of the current month.
    }

