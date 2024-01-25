package Aufgabenteil2;

import java.util.Scanner;

public class Aufgabe9_changed {
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
