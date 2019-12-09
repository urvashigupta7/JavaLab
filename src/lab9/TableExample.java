package lab9;

import javax.swing.*;

public class TableExample {
    JFrame f;
    JTable j;

    TableExample() {
        f = new JFrame();
        f.setTitle("TableExample");
        String[][] data = {
                {
                        "Ekta", "7", "CSE"}, {
                "Urvashi", "42", "CSE"}
        };
        String []columnNames={"Name","Roll No","Department"};
        j=new JTable(data,columnNames);
        j.setBounds(30,40,200,300);
        JScrollPane sp=new JScrollPane(j);
        f.add(sp);
        f.setSize(500,200);
        f.setVisible(true);
    }

    public static void main(String[] args) {
         new TableExample();
    }
}
