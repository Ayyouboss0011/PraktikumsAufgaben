package Aufgabenteil1;

import java.util.Scanner;

public class Aufgabe6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        double Zahl1  = scanner.nextDouble();

        System.out.println("Zahl 2: ");
        double Zahl2 = scanner.nextDouble();

        double ergebnis = Zahl1 / Zahl2;
        System.out.println(ergebnis);
    }
}
