/**
 * CIS150AB
 * Created by ahutsona on 5/25/15.
 * Revised by ahutsona on 6/2/15
 * OOP_Graphics_P2.11
 */



import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

class FaceComponent extends JComponent {

    public void paintComponent(Graphics graph) {

        // Cast graph from Graphics to Graphics2D.
        Graphics2D graph2D = (Graphics2D) graph;

		// Draw head it.
		Ellipse2D.Double head = new Ellipse2D.Double(95, 65, 120, 120);
        graph2D.setColor(Color.blue);
        graph2D.setStroke(new BasicStroke((float) 2.25));
        graph2D.draw(head);

        // Draw eyes.
        Ellipse2D.Double eyeLeft = new Ellipse2D.Double(130, 110, 10, 10);
		Ellipse2D.Double eyeRight = new Ellipse2D.Double(170, 110, 10, 10);
		graph2D.draw(eyeLeft);
        graph2D.draw(eyeRight);

		// Draw mouth
		Line2D.Double mouth = new Line2D.Double(128,146,180,146);
		graph2D.draw(mouth);

		// Show message
		graph2D.drawString("Hi Ms. Surber...", 115, 230);
    }
}