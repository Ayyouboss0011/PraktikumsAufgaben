package Aufgabenteil2;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wählen Sie eines der folgenden Funktionen aus: ");
        System.out.println("1. f(x)= 3x^2 + 5");
        System.out.println("2. f(x)= 5x^3 - 4");
        System.out.println("3. f(x)= 6x^5 + 3x - 2");

        System.out.print("Eingabe: ");
        int eingabe = scanner.nextInt();

        System.out.print("Geben Sie xmin an: ");
        int xmin = scanner.nextInt();

        System.out.print("Geben Sie xmax an: ");
        int xmax = scanner.nextInt();

        System.out.print("Geben Sie deltax an: ");
        int deltax = scanner.nextInt();

        switch (eingabe){
            case 1:
                System.out.println("Wertetabelle für die Funktion: f(x)= 3x^2 + 5");
                for( int x = xmin; x <= xmax ; x += deltax ){
                    System.out.println("f(" + x + ") = " + (3 * Math.pow(x,2) + 5));
                }
            case 2:
                System.out.println("Wertetabelle für die Funktion: f(x)= 5x^3 - 4");
                for( int x = xmin; x <= xmax ; x += deltax ){
                    System.out.println("f(" + x + ") = " + (5 * Math.pow(x,3) - 4));
                }
            case 3:
                System.out.println("Wertetabelle für die Funktion: f(x)= 6x^5 + 3x - 2");
                for( int x = xmin; x <= xmax ; x += deltax ){
                    System.out.println("f(" + x + ") = " + (6 * Math.pow(x,5) + 3*x - 2));
                }
        }

    }
}
