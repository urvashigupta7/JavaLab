package javalab.javalab5;

import java.applet.Applet;
import java.awt.*;

/* <applet code="Font.class" height="300" width="300"></applet> */
public class Font extends Applet {
    private java.awt.Font f1, f2, f3;

    public void init() {
        f1 = new java.awt.Font("Arial", java.awt.Font.BOLD, 10);
        f2 = new java.awt.Font("Forte", java.awt.Font.PLAIN, 20);
        f3 = new java.awt.Font("Elephant", java.awt.Font.ITALIC, 25);
    }

    public void paint(Graphics g) {
        g.drawString("Urvashi", 50, 50);

        g.setFont(f1);
        g.drawString("Ekta", 50, 90);

        g.setFont(f2);
        g.drawString("Anushka", 50, 130);

        g.setFont(f3);
        g.drawString("Akanksha", 50, 170);
    }
}
