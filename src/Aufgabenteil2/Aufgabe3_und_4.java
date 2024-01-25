package Aufgabenteil2;
/*
eine Wertetabelle für eine spezifische Funktion (z. B. f(x) = 2 * sin(x) - 4)
ausgibt (xmin, xmax, Δx sind fest, z. B. xmin = -5, xmax = 5, Δx = 1)
 */

public class Aufgabe3_und_4 {
    public static void main(String[] args) {
        System.out.println("Wertetabelle für die Funktion: f(x) = 2 * sin(x) - 4");
        int xmin = 1;
        int xmax = 10;
        int deltax = 1;

        for( int i = xmin; i <= xmax ; i += deltax ){
            System.out.println("f(" + i + ") = " + (2 * Math.sin(i) - 4));
        }
    }


}
