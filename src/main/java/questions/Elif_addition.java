package questions;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Elif_addition {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int i = 1;
                int cevap;

                while (i <= 50) {
                    int sayi1 = (int) (Math.random() * 9999) + 1;
                    int sayi2 = (int) (Math.random() * 9999) + 1;
                    int sonuc = sayi1 + sayi2;

                    System.out.println("Elifcim Soru-" + i + " : " + sayi1 + " + " + sayi2 + " = ?");

                    while (true) {
                        try {
                            System.out.print("Cevabin: ");
                            cevap = scanner.nextInt();
                            if (cevap == sonuc) {
                                System.out.println("Tebrikler bildin, benim canim kizim .... ");
                                break;
                            } else {
                                System.out.println("Bir daha dene canim.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Lütfen bir sayı girer misin.");
                            scanner.next();
                        }
                    }
                    i++;


                }
            }}

