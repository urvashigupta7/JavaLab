package javalab.javalab5;


    import java.applet.Applet;
    import java.awt.*;

    /* <applet code="Draw.class" height="400" width="750"></applet> */
    public class Draw extends Applet {
        public void init() {
            setBackground(Color.WHITE);
            showStatus("Hi");
        }

        public void paint(Graphics g) {
            int x[] = {640, 670, 670, 610, 610, 640};
            int y[] = {205, 230, 270, 270, 230, 205};
            g.setColor(Color.BLUE);
            g.drawLine(10, 10, 100, 100);
            g.setColor(Color.YELLOW);
            g.drawRect(200, 50, 110, 70);
            g.setColor(Color.ORANGE);
            g.fillRect(400, 50, 110, 70);
            g.setColor(Color.GREEN);
            g.drawRoundRect(600, 50, 110, 70, 15, 15);
            g.setColor(Color.darkGray);
            g.fillRoundRect(10, 200, 110, 70, 15, 15);
            g.setColor(Color.yellow);
            g.drawOval(205, 205, 100, 70);
            g.setColor(Color.RED);
            g.fillOval(405, 205, 100, 70);
            g.setColor(Color.BLUE);
            g.drawPolygon(x, y, 5);
        }
    }

