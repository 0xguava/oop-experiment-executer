package oop_experiment.exp10;

import java.applet.Applet;
import java.awt.Graphics;

public class MessageApplet extends Applet {
    
    // This method will be called to display content in the applet window
    @Override
    public void paint(Graphics g) {
        // Display a message in the applet window
        g.drawString("Hello, Welcome to Java Applet!", 50, 50);
    }
}
