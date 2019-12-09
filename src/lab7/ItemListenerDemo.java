package lab7;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;


public class ItemListenerDemo extends Applet implements ItemListener {
    Label l;
    Checkbox checkbox1;
    Checkbox checkbox2;
    public void init(){
        l=new Label();
        l.setAlignment(1);
        l.setSize(400,100);
        checkbox1=new Checkbox("C++");
        checkbox2=new Checkbox("java");
        checkbox1.setBounds(100,100,50,50);
        checkbox2.setBounds(100,150,50,50);
        add(checkbox1);
        add(checkbox2);
        add(l);
        checkbox1.addItemListener(this);
        checkbox2.addItemListener(this);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        if(e.getSource()==checkbox1)
            l.setText("C++ Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
        if(e.getSource()==checkbox2)
            l.setText("Java Checkbox: "
                    + (e.getStateChange()==1?"checked":"unchecked"));
    }
}
