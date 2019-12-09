package lab9;

import javax.swing.*;

public class FirstSwing {
    int text=0;
    public static void main(String[] args)  {
        JFrame f=new JFrame();
        JButton b=new JButton("click");
        JTextField tf=new JTextField();
        tf.setBounds(10,10,200,40);
        b.setBounds(210,10,100,40);
        f.add(b);
        f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }

}
