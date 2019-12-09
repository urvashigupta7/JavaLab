package javalab;

import java.util.Scanner;

public class Box {
    int length;
    int breadth;
    int height;

    public Box(int width, int depth, int height) {
        this.length = width;
        this.breadth = depth;
        this.height = height;
    }

    public Box() {
        this.length = 0;
        this.breadth = 0;
        this.height = 0;
    }

    public void print() {
        System.out.println("length= " + length);
        System.out.println("length= " + breadth);
        System.out.println("length= " + height);
    }
}

class Coloredbox extends Box {
    String color;

    Coloredbox() {
        super();
    }

    Coloredbox(int l, int b, int h) {
        super(l, b, h);
    }

    public void getcolor() {
        System.out.println("enter color of the box");
        Scanner scrn = new Scanner(System.in);
        color = scrn.next();
    }

    public void print() {
        System.out.println("length= " + length);
        System.out.println("length= " + breadth);
        System.out.println("length= " + height);
        System.out.println("color=" + color);
    }

}

class test {
    public static void main(String[] args) {
        Coloredbox b = new Coloredbox(10,15,20);
        b.getcolor();
        b.print();


    }
}
