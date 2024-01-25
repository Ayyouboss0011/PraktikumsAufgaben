package Aufgabenteil2;
/*
eine Wertetabelle für eine Polynomfunktion beliebigen Grades ausgibt,
für die der Benutzer zur Laufzeit die Koeffizienten eingeben kann
 */
import java.util.Scanner;

public class Aufgabe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Rechner kann aufgrund der sonst sehr hohen Variablenzahl nur bis 8 Rechnen :-)
        System.out.println("Geben Sie den Grad der Funktion an: ");
        int grad = scanner.nextInt();

        String[] koeffizient_buchstaben = {"a", "b", "c", "d", "e", "f", "g", "h"};
        double[] koeffizienten = new double[grad + 1];

        for (int i = 0; i <= grad; i++) {
            System.out.println("Geben Sie den Koeffizienten " + koeffizient_buchstaben[i] + " an: ");
            koeffizienten[i] = scanner.nextDouble();
        }

        System.out.println("Geben Sie xmin an: ");
        int xmin = scanner.nextInt();

        System.out.println("Geben Sie xmax an: ");
        int xmax = scanner.nextInt();

        System.out.println("Geben Sie das delta an: ");
        int delta = scanner.nextInt();

        System.out.println("Wertetabelle für die Funktion: ");
        ssh-ed25519 AAAAC3NzaC1lZDI1NTE5AAAAICaZJNqrDbKYSzYSaDoY6NA0l2qHR7Iarommu10ARL83 ayyoub.ag@gmail.com
        for (int x = xmin ; x <= xmax ; x += delta) {
            double funktionswert = 0;
            int exponent = grad;

            for (int i = 0; i <= grad - 1; i++) {
                funktionswert += koeffizienten[i] * Math.pow(x, exponent);
                exponent--;
            }
            System.out.println("f(" + x + ") = " + funktionswert);
        }
    }
}
