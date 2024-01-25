package Aufgabenteil1;
import java.math.BigDecimal;


/*
1. das eine Variable vom Typ double deklariert, ihr den Wert 0 (0d) zuweist, zu ihr in zwei Schritten zuerst 0,3 und dann 5,1 addiert und den Wert der Variablen dann auf der Konsole ausgibt. Was fällt auf?
2. Schreibe das gleiche Programm unter Verwendung des Datentyps float (statt des primitiven Datentyps double).
3. Schreibe das gleiche Programm unter Verwendung der Klasse BigDecimal (statt der primitiven Datentypen double bzw. float), verwende dabei einmal den Konstruktor BigDecimal(double val) und einmal die statische Methode BigDecimal.valueOf(String val).

*/

public class Aufgabe12 {
    public static void main(String[] args) {
        double zahl = 0;
        zahl += 0.3;
        zahl += 5.1;

        System.out.println(zahl);

        //Das Ergebnis ist 5.3999999999999995 bzw != 5,4

        float zahl1 = 0f;
        zahl1 += 0.3f;
        zahl1 += 5.1f;

        System.out.println(zahl1);

        //Mit floats kommt 5,4 heraus

        BigDecimal ergebnis = new BigDecimal(0.0);

        double ersteZahl = 0.3;
        ergebnis = ergebnis.add(BigDecimal.valueOf(ersteZahl));
        double zweiteZahl = 5.1;
        ergebnis = ergebnis.add(BigDecimal.valueOf(zweiteZahl));

        System.out.println(ergebnis);

        //oder

        BigDecimal ergebnis2 = new BigDecimal("0.0");
        ergebnis2 = ergebnis2.add(new BigDecimal("0.3"));
        ergebnis2 = ergebnis2.add(new BigDecimal("5.1"));

        System.out.println(ergebnis2);
    }
}
