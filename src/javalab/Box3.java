package javalab;

public class Box3 {
    //instance variables
    int length;
    int width;
    int height;

    //constructor
    public Box3(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    //function to compute volume with return statement
    public int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        //initialization of object using constructor
        Box3 b1 = new Box3(3,4,5);
        System.out.println("For B1");
        System.out.println("Volume of the box is " + b1.volume());
        //initialization of object using constructor
        Box3 b2 = new Box3(5,6,7);
        System.out.println("For B2");
        System.out.println("Volume of the box is " + b2.volume());
    }
}
