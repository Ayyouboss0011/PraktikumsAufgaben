package Aufgabenteil1;

import java.util.Scanner;

/*
das Ergebnis der Division zweier auf der Konsole eingebbarer Zahlen berechnet, in einer Variablen speichert,
auf vier Nachkommastellen kaufmännisch rundet und dann auf der Konsole ausgibt.
 */
public class Aufgabe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        double Zahl1  = scanner.nextDouble();

        System.out.println("Zahl 2: ");
        double Zahl2 = scanner.nextDouble();

        double ergebnis = Zahl1 / Zahl2;

        //Zahl wird mit 10^4 multipliziert, also um 4 stellen nach rechts verrückt,
        //anschließend in einen integer umgewandelt --> etwaige Nachkommastellen fallen weg
        double formatiertesErgebnis = (int) (ergebnis * Math.pow(10 , 4));

        //Zahl wird durch 10^4 dividiert, also um 4 stellen nach links verrückt
        // --> Es entsteht wieder eine Dezimalzahl.
        formatiertesErgebnis = formatiertesErgebnis / Math.pow(10 , 4);

        // Die Zahl wird erst in einen char[] umgewandelt.
        char[] chararray = String.valueOf(formatiertesErgebnis).toCharArray();

        System.out.println("Zahl vorher: " + new String (chararray));

        //runde kaufmännisch auf oder ab
        if(chararray[chararray.length - 1] >= '5'){
            chararray[chararray.length - 2] += '1';
            chararray[chararray.length - 1] = '0';
        }
        else {
            chararray[chararray.length - 1] = '0';
        }

        System.out.println("Zahl nachher: " + new String (chararray));
    }
}
