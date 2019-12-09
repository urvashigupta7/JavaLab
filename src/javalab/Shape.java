package javalab;

import java.util.Scanner;

public class Shape{
    int length;
    int breadth;

    public void getdata() {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter value of length");
        length = scrn.nextInt();
        System.out.println("Enter value of breadth");
        breadth= scrn.nextInt();
    }
    public void printdata()
    {

    }

}
class rectangle extends Shape{
    public void printdata()
    {
        System.out.println("length ="+length);
        System.out.println("breadth ="+breadth);
    }

    public static void main(String[] args) {

        rectangle r=new rectangle();
        r.getdata();
        r.printdata();
    }

}

