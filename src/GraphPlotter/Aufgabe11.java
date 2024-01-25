package GraphPlotter;

import javax.swing.*;

// Klasse, die von JPanel erbt


public class Aufgabe11 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Koordinatensystem Beispiel");

        // Erstelle eine Instanz der Klasse, die von JPanel erbt
        Koordinatensystem panel = new Koordinatensystem();

        // Füge das Panel dem JFrame hinzu
        frame.add(panel);

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
