package lab7;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class keyListener extends Applet implements KeyListener  {
    Label l;
    String s;
    TextArea area;
    public void init(){
        l=new Label();
        l.setBounds(20,50,100,20);
        area=new TextArea();
        area.setBounds(20,80,300, 300);
        area.addKeyListener(this);

        add(l);add(area);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    s="";
    }
    @Override
    public void keyTyped(KeyEvent e) {
        s+=e.getKeyChar();
        l.setText(s);
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
