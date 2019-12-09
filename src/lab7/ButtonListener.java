package lab7;

import java.applet.Applet;
 import java.awt.*;
 import java.awt.event.*;
 /*<applet code="ButtonListener.class" height="500" width="500"></applet> */
public class ButtonListener extends Applet implements ActionListener {
    Button b;
    int times=0;
    public void init(){

        b=new Button("Click");
        b.setBounds(100,100,50,20);
        add(b);
        b.addActionListener(this);
        setLayout(null);
    }
    public void paint(Graphics g){
        g.drawString(Integer.toString(times),50,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        times++;
        repaint();

    }
}