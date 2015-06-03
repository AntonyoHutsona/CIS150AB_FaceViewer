/*
 * CIS150AB
 * Created by ahutsona on 5/25/15.
 * OOP_Graphics_P2.11
 */

import javax.swing.*;
import java.util.concurrent.atomic.AtomicReference;

class FaceViewer {
    public static void main(String[] args) {

        // Frame object.
        JFrame frame = new JFrame();

        // Frame size.
        frame.setSize(300, 300);

        // Frame title bar.
        frame.setTitle("This Is My Happy Face");

        // Default closing action.
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        /*
        * Set face object to appear in frame.
        * Add face object to frame.
        * Set frame to to visible.
        */
        FaceComponent blueFace = new FaceComponent();
        frame.add(blueFace);
        frame.setVisible(true);

    }
}