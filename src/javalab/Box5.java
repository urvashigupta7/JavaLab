package javalab;

public class Box5 {
    //instance variables
    int length;
    int width;
    int height;

    //this keyword has current object's reference

    //constructor 1
    public Box5(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    //constructor 2
    public Box5(int x) {
        this.length = x;
        this.width = x;
        this.height = x;
    }


    //function to compute volume with return statement
    public int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        //initialization of object using constructor 1
        Box5 b1 = new Box5(3, 4, 5);
        System.out.println("For B1");
        System.out.println("Volume of the box is " + b1.volume());
        //initialization of object using constructor 2
        Box5 b2 = new Box5(5);
        System.out.println("For B2");
        System.out.println("Volume of the box is " + b2.volume());
    }
}
