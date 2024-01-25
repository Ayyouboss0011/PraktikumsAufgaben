package GraphPlotter;

import javax.swing.*;
import java.awt.*;

public class Koordinatensystem extends JPanel{
        // Überschreibe die paintComponent-Methode, um das Koordinatensystem zu zeichnen
        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Hier erfolgt die Zeichenlogik für das Koordinatensystem eingeben
            //...

            // Beispiel: Zeichne die Achsen
            g.setColor(Color.BLACK);
            g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);
            g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());
            g.drawString("X", getWidth() - 10, getHeight() / 2 - 5);
            g.drawString("Y", getWidth() / 2 + 5, 10);

        }
}
