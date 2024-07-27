package questions;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

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
        add30Days(LocalDate.of(2024,07,23));



// 102. Initialize a LocalDate object for your birthday and calculate how many days old you are today.
        LocalDate birthday = LocalDate.of(1975,12,28);
        LocalDate today = LocalDate.of(2024, 07 ,24);
        System.out.println(numberOfDays(today, birthday));


// 103. Write a method that takes two dates and returns whether the first is before the second.
        String date1 = "2023-01-01";
        String date2 = "2023-01-02";
        String dateFormat = "yyyy-MM-dd";

        boolean result = isBefore(date1, date2, dateFormat);
        System.out.println(result);  // Output: true

// 104. Create a Java program that prints the current month in the format "MM" (e.g., "05" for May).
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM");
        System.out.println(currentDate.format(formatter));


// 105. Write a program that subtracts 100 days from the current date and prints the date in the format "YYYY-MM-DD".
        changeDate();

// 106. Create a method that takes a year and prints if it is a leap year or not.

        isLeap(2020);  // Should print: It is a leap year.
        isLeap(1900);  // Should print: It is not a leap year.
        isLeap(2000);  // Should print: It is a leap year.
        isLeap(2021);  // Should print: It is not a leap year.

    }

    public static void isLeap(int year){
        if(year%400==0 ||  (year%4==0 && year%100!=0)){
            System.out.println("it is leap year");
        } else {
            System.out.println("It is not leap year");
        }
    }
    public static void changeDate(){
       LocalDate date = LocalDate.now();
       LocalDate newDate = date.minusDays(100);
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
       System.out.println(newDate.format(formatter));


    }

    public static boolean isBefore(String date1, String date2, String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        try {
            Date d1 = sdf.parse(date1);
            Date d2 = sdf.parse(date2);
            return d1.before(d2);
        } catch (ParseException e) {
            System.out.println("Error parsing dates: " + e.getMessage());
            return false;
        }
    }


    private  static void add30Days(LocalDate date){
        System.out.println(date.plusDays(30));
    }
    private static void replaceWord(String str){
        str = str.toLowerCase().replaceAll("error", "warning");
        System.out.println(str);
    }

    private static long numberOfDays(LocalDate date1, LocalDate date2){
        return ChronoUnit.DAYS.between(date1, date2);
    }
}
