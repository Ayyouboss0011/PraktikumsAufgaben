package Aufgabenteil1;
/*
das Ergebnis der Division der als int-Variablen deklarierten ganzen Zahlen 153 und 48 (153 geteilt durch 48) berechnet, in einer weiteren Variablen vom Typ int speichert und dann auf der Konsole ausgibt.
Was fällt auf?
Welche Änderungen könnte man vornehmen, um das Verhalten des Programms zu verändern?

 */
public class Aufgabe4 {
    public static void main(String[] args) {
        int Zahl1  = 153;
        int Zahl2 = 48;

        int ergebnis = Zahl1 / Zahl2;
        System.out.println(ergebnis);
    }
}

/*
Es wird eine Ganzzahldivision vorgenommen, da bei dem Ergebnis eine Dezimalzahl herauskommt.
Um das verhalten zu ändern, könnte man einen anderen primitiven Datentyp nutzen,
der für eine solche Operation besser geeignet ist und das tatsächliche Ergebnis besser annähert.

 */
