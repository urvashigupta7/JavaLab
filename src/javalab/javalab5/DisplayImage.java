package javalab.javalab5;

import java.awt.*;
import java.applet.Applet;

/* <applet code="DisplayImage.class" height="300" width="300"></applet> */
public class DisplayImage extends Applet {

    private Image picture;
    private String msg1="";
    private String msg2="";




    public void init() {
        picture = getImage(getDocumentBase(),"hqdefault.jpg");
        msg1+=getCodeBase();
        msg2+=getDocumentBase();
    }

    public void paint(Graphics g) {

        g.drawImage(picture, 30,30, this);
    }

}