package Aufgabenteil2;

import java.util.Scanner;

public class Aufgabe8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Koeffizienten a an: ");
        int a = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten b an: ");
        int b = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten c an: ");
        int c = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten c an: ");
        int d = scanner.nextInt();

        System.out.println("Geben Sie den Koeffizienten c an: ");
        int e = scanner.nextInt();

        System.out.println("Wertetabelle für die Funktion: f(x) = " + a + "x^4 + " + b + "x^3 + " + c + "x^2 + " + d + "x + " + e);

        for( int x = 1; x <= 10 ; x++ ){
            System.out.println("f(" + x + ") = " + (a * Math.pow(x,4) + b * Math.pow(x,3) + c * Math.pow(x,2) + d * x + e));
        }
    }
}
