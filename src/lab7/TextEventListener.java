package lab7;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="TextEventListener.class" height="500" width="500"></applet> */
public class TextEventListener extends Applet implements ActionListener {
    Button b;
    TextField t;
    int times=0;
    public void init(){
        t=new TextField();
        t.setBounds(40,40,200,20);
        b=new Button("Click");
        b.setBounds(100,100,50,20);
        add(b);
        add(t);
        b.addActionListener(this);
        setLayout(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        times++;
        t.setText(Integer.toString(times));
    }
}