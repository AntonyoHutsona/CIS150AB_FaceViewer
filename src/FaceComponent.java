/**
 * CIS150AB
 * Created by ahutsona on 5/25/15.
 * OOP_Graphics_P2.11
 */

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

class FaceComponent extends JComponent {
    public void paintComponent(Graphics g) {
        // Recover Graphics2D.
        Graphics2D g2 = (Graphics2D) g;

        // Draw head it.
        g2.setColor(Color.blue);
        g2.setStroke(new BasicStroke((float) 2.25));
        Ellipse2D.Double head = new Ellipse2D.Double(95, 65, 120, 120);
        g2.draw(head);

        // Draw eyes.
        g2.setColor(Color.blue);
        Ellipse2D.Double eyeLeft = new Ellipse2D.Double(130, 110, 10, 10);
        g2.draw(eyeLeft);
        Ellipse2D.Double eyeRight = new Ellipse2D.Double(170, 110, 10, 10);
        g2.draw(eyeRight);

        // Draw mouth.
        g2.setColor(Color.blue);
        Rectangle mouth = new Rectangle(127, 145, 55, 2);
        g2.fill(mouth);

    }
}