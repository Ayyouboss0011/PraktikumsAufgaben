package Aufgabenteil2;

import java.util.Scanner;

/*
eine Wertetabelle für eine Polynomfunktion zweiten Grades ausgibt,
für die der Benutzer zur Laufzeit die Koeffizienten eingeben kann
 */
public class Aufgabe7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Koeffizienten a an: ");
        int a = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten b an: ");
        int b = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten c an: ");
        int c = scanner.nextInt();

        System.out.println("Wertetabelle für die Funktion: f(x) = " + a + "*x^2 + " + b + "*x + " + c);

        for( int x = 1; x <= 10 ; x++ ){
            System.out.println("f(" + x + ") = " + (a * Math.pow(x,2) + b * x + c));
        }
    }
}
