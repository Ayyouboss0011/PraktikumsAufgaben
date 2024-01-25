package Aufgabenteil2;

import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Die Funktion lautet y = 5x + 7");
        System.out.println("Geben Sie ein x ein: ");
        double x = scanner.nextDouble();
        double y = 5 * x + 7;
        System.out.println("Der x-Wert: " + x + " hat den zugehörigen y-Wert: " + y);

    }
}
