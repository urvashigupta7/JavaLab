package javalab.javalab5;
import java.applet.Applet;
import java.awt.*;

/* <applet code="AppControls.class" height="500" width="500"></applet> */

public class Controls extends Applet {
    public void init() {

        Checkbox cb = new Checkbox("Checkbox");
        this.add(cb);

        CheckboxGroup cbg = new CheckboxGroup();
        this.add(new Checkbox("CB 1", cbg, false));
        this.add(new Checkbox("CB 2", cbg, true));
        this.add(new Checkbox("CB 3", cbg, false));

        Choice choice = new Choice();
        choice.addItem("Item 1");
        choice.addItem("Item 2");
        choice.addItem("Item 3");
        this.add(choice);

        Label l = new Label("Label for Name");
        this.add(l);

        TextField t = new TextField("TextField", 40);
        this.add(t);

        Button b = new Button("Test Button");
        this.add(b);

        List list = new List(5);
        list.add("item 1");
        list.add("item 2");
        list.add(" item 3");
        list.add("item 4");
        this.add(list);

        TextArea textArea = new TextArea("Text Area", 10, 30);
        this.add(textArea);

        showStatus("MyApp");
    }

    public void paint(Graphics g) {
        showStatus("MyApp");
    }
}
