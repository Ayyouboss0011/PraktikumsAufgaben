package Aufgabenteil2;

import java.util.Scanner;

/*
eine Wertetabelle für eine spezifische Polynomfunktion ausgibt
(xmin, xmax, Δx sind zur Laufzeit vom Benutzer eingebbar, wie auch in den folgenden Aufgaben)
*/
public class Aufgabe5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wertetabelle für die Funktion: f(x) = 2 * x^4 - 4");

        System.out.println("Geben Sie xmin an: ");
        int xmin = scanner.nextInt();

        System.out.println("Geben Sie xmax an: ");
        int xmax = scanner.nextInt();

        System.out.println("Geben Sie deltax an: ");
        int deltax = scanner.nextInt();

        for( int i = xmin; i <= xmax ; i += deltax ){
            System.out.println("f(" + i + ") = " + (2 * Math.pow(i,4) - 4));
        }
    }
}
