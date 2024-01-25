package Aufgabenteil2;

import java.util.Scanner;

/*
die Lösungsmenge für quadratische Gleichungen der Form
ax2 + bx + c = 0 mit beliebigen Koeffizienten unter Anwendung der pq-Formel ermittelt
 */
public class Aufgabe10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nullstellen Rechner (quadratische Funktionen)");
        System.out.println("Form: ax^2 + bx + c");

        //Input vom Benutzer
        System.out.print("Geben Sie den Wert für a ein: ");
        double a = scanner.nextDouble();
        System.out.println();

        System.out.print("Geben Sie den Wert für b ein: ");
        double b = scanner.nextDouble();
        System.out.println();

        System.out.print("Geben Sie den Wert für c ein: ");
        double c = scanner.nextDouble();
        System.out.println();

        /*
        pq-Formel:
        1. (-1)*(p/2) + Math.sqrt(Math.pow((p/2),2)-q)
        2. (-1)*(p/2) - Math.sqrt(Math.pow((p/2),2)-q)
         */

        calculate_pq(a,b,c);
    }

    public static void calculate_pq(double a, double b, double c){
        if(a == 1){
            double x1 = (-1)*(b/2) + Math.sqrt(Math.pow((b/2),2)-c);
            double x2 = (-1)*(b/2) - Math.sqrt(Math.pow((b/2),2)-c);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        else{
            b = b/a;
            c = c/a;
            a = 1;
            calculate_pq(a,b,c);
        }
    }


}
