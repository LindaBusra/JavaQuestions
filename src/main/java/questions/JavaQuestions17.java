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
        DayOfWeek dayOfWeek = firstDayOfYear.getDayOfWeek();
        System.out.println(dayOfWeek);


// 111. Develop a method that takes a date and an integer N and returns the date N days after.
        LocalDate initialDate = LocalDate.of(2024, 5, 1); // Set a specific date
        int daysToAdd = 10; // Number of days to add
        LocalDate newDate = addDaysToDate(initialDate, daysToAdd);
        System.out.println("New date after adding " + daysToAdd + " days: " + newDate);


// 112. Create a Java program that calculates the number of weekdays between two dates.
        LocalDate date1 = LocalDate.of(2024,8,30);
        LocalDate date2 = LocalDate.of(2024,8,1);
        long dates = countWeekdays(date1, date2);
        System.out.println(dates);



// 113. Write a method that prints all the Thursdays of the current month.

    }

    public static long countWeekdays(LocalDate startDate, LocalDate endDate) {
        // Ensure the start date is before the end date
        if (startDate.isAfter(endDate)) {
            LocalDate temp = startDate;
            startDate = endDate;
            endDate = temp;
        }

        long weekdayCount = 0;
        LocalDate date = startDate;

        while (!date.isAfter(endDate)) {
            int dayOfWeek = date.getDayOfWeek().getValue();
            if (dayOfWeek >= 1 && dayOfWeek <= 5) {  // Monday (1) to Friday (5)
                weekdayCount++;
            }
            date = date.plusDays(1);  // Increment the date by one day
        }

        return weekdayCount;
    }

    public static LocalDate addDaysToDate(LocalDate date, int daysToAdd) {
        return date.plusDays(daysToAdd);
    }

    public static String convertDateFormat(String dateString) {
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(dateString, inputFormatter);
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return date.format(outputFormatter);
    }






    }

