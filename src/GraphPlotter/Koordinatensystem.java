package GraphPlotter;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class Koordinatensystem extends JPanel {
    private final int grad = 3; // Grad der Funktion
    private final double[] koeffizienten = {2, 3, 4, 2}; // Koeffizienten setzen

    private final int xmin = -150;
    private final int xmax = 150;
    private final int delta = 1;

    // Überschreibe die paintComponent-Methode, um das Koordinatensystem zu zeichnen
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        System.out.println("Wertetabelle für die Funktion: ");

        double[] Y_Array = new double[(xmax - xmin) / delta + 1];

        // Iteriere über alle x
        for (int x = xmin; x <= xmax; x += delta) {
            double funktionswert = 0;
            int exponent = grad;

            // Rechne den Funktionswert für ein x aus
            for (int i = 0; i <= grad; i++) {
                funktionswert += koeffizienten[i] * Math.pow(x, exponent);
                exponent--;
            }

            System.out.println("f(" + x + ") = " + funktionswert);

            int scaledX = scale(x, xmin, xmax, 0, getWidth());
            int scaledY = scale((int) funktionswert, (int) Y_ArrayMin(Y_Array), (int) Y_ArrayMax(Y_Array), getHeight(), 0);

            Y_Array[(x - xmin) / delta] = funktionswert;

            // Beispiel: Zeichne die Achsen
            g.setColor(Color.BLACK);
            g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
            g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
            g.drawString("X", getWidth() - 10, getHeight() / 2 - 5);
            g.drawString("Y", getWidth() / 2 + 5, 10);

            // Zeichne den Graphen (als Linie)
            g.setColor(Color.BLUE);
            if (x > xmin) {
                int prevScaledX = scale(x - delta, xmin, xmax, 0, getWidth());
                int prevScaledY = scale((int) Y_Array[(x - delta - xmin) / delta], (int) Y_ArrayMin(Y_Array), (int) Y_ArrayMax(Y_Array), getHeight(), 0);
                int currentScaledX = scale(x, xmin, xmax, 0, getWidth());
                int currentScaledY = scale((int) funktionswert, (int) Y_ArrayMin(Y_Array), (int) Y_ArrayMax(Y_Array), getHeight(), 0);

                g.drawLine(prevScaledX, prevScaledY, currentScaledX, currentScaledY);
            }

            // Zeichne die Punkte
            g.fillOval(scaledX - 2, scaledY - 2, 5, 5);

        }
    }

    private int scale(int value, int minInput, int maxInput, int minOutput, int maxOutput) {
        if (maxInput - minInput == 0) {
            // Falls man durch null teilt
            return minOutput + (maxOutput - minOutput) / 2;
        }
        return (value - minInput) * (maxOutput - minOutput) / (maxInput - minInput) + minOutput;
    }

    private double Y_ArrayMin(double[] array) {
        return Arrays.stream(array).min().orElse(0);
    }

    private double Y_ArrayMax(double[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);

        Koordinatensystem koordinatensystem = new Koordinatensystem();
        frame.add(koordinatensystem);

        frame.setVisible(true);
    }
}
