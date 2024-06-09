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

                    System.out.println("For Ada Eflif spørsmål" + i + " : " + sayi1 + " + " + sayi2 + " = ?");

                    while (true) {
                        try {
                            System.out.print("Svaret ditt: ");
                            cevap = scanner.nextInt();
                            if (cevap == sonuc) {
                                System.out.println("\"Gratulerer jenta mi, det er riktig svar :) Nå kommer det en til : .... ");
                                break;
                            } else {
                                System.out.println("Du kan prøve igjen.");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Det er ikke et tall. Kan du skrive tallet riktig? ");
                            scanner.next();
                        }
                    }
                    i++;


                }
            }}

