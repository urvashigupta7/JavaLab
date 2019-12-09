package lab7;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class mouselistener extends Applet implements MouseListener,MouseMotionListener {
    Label l;
    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
        l=new Label();
        l.setBounds(20,50,100,20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
          l.setText("mouse clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("mouse entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("mouse exited");
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        l.setText("mouse dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    }
}
