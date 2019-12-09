package javalab.javalab5;

import java.applet.Applet;
import java.awt.*;

/* <applet code="Lifecycle.class" height="300" width="300"></applet> */
public class Lifecycle extends Applet{
    String msg=" ";
    public void init()
    {
        msg=msg+" init()";
    }
    public void start()
    {
        msg=msg+" start()";
    }
    public void paint(Graphics g)
    {
        msg=msg+" paint()";
        g.drawString(msg,10,30);
    }
    public void stop()
    {
        msg=msg+" stop()";
    }
    public void destroy()
    {
        msg=msg+" destroy()";
    }
}
