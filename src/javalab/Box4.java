package javalab;

public class Box4 {
    //instance variables
    int length;
    int width;
    int height;

    //constructor 1
    public Box4(int l, int w, int h) {
        length = l;
        width = w;
        height = h;
    }

    //constructor 2
    public Box4(int x) {
        length = x;
        width = x;
        height = x;
    }


    //function to compute volume with return statement
    public int volume() {
        return length * width * height;
    }

    public static void main(String[] args) {
        //initialization of object using constructor 1
        Box4 b1 = new Box4(3, 4, 5);
        System.out.println("For B1");
        System.out.println("Volume of the box is " + b1.volume());
        //initialization of object using constructor 2
        Box4 b2 = new Box4(5);
        System.out.println("For B2");
        System.out.println("Volume of the box is " + b2.volume());
    }
}
