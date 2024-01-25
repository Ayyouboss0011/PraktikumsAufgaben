package Aufgabenteil1;

import java.util.Scanner;

//das Ergebnis der Division zweier auf der Konsole eingebbarer Zahlen berechnet, in einer Variablen speichert
// und es - ohne zu Runden oder abzuschneiden - mit zwei Dezimalstellen auf der Konsole ausgibt.
public class Aufgabe11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Zahl 2: ");
        double zahl2 = scanner.nextDouble();

        double ergebnis = zahl1 / zahl2;

        double formatiertesergebnis = (int) (ergebnis * 100);
        formatiertesergebnis = formatiertesergebnis / 100;

        System.out.println(formatiertesergebnis);
    }
}
