package Aufgabenteil2;
/*
die y-Werte für eine spezifische Funktion (z. B. f(x) = 2 * cos(x) + 3)
und zwei oder drei spezifische x-Werte ausgibt (z. B. x1 = 2, x2 = 5, x3= 125)
 */
public class Aufgabe2 {
    public static void main(String[] args) {
        double[] xWerte = {1.0,2.0,3.0};
        System.out.println("Für die Funktion f(x) = 2 * cos(x) + 3 gilt: ");

        for( double element : xWerte ){
            System.out.println("x"+ element + " = " + 2 * Math.cos(element) + 3);
        }

    }
}
