package Aufgabenteil1;

import java.util.Scanner;

/*
das Ergebnis der Division zweier auf der Konsole eingebbarer Zahlen berechnet,
in einer Variablen speichert, auf vier Nachkommastellen abschneidet und dann auf der Konsole ausgibt.
 */
public class Aufgabe9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        double Zahl1  = scanner.nextDouble();

        System.out.println("Zahl 2: ");
        double Zahl2 = scanner.nextDouble();


        double ergebnis = Zahl1 / Zahl2;

        double formatiertesErgebnis = (int) (ergebnis * Math.pow(10 , 4)); //Zahl wird mit 10^4 multipliziert, also um 4 stellen nach rechts verrückt.
        formatiertesErgebnis = formatiertesErgebnis / Math.pow(10 , 4);

        System.out.println(formatiertesErgebnis);
    }
}
