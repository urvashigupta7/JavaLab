package javalab;

public class Box1 {
    //instance variables
    int length;
    int width;
    int height;

    //function to getdata for boxes
    public void getdata(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }

    //function to compute volume
    public void volume() {
        System.out.println("Volume of the box is " + length * width * height);
    }

    public static void main(String[] args) {
        Box1 b1 = new Box1();
        b1.getdata(5,3,4);
        System.out.println("For B1");
        b1.volume();
        Box1 b2 = new Box1();
        b2.getdata(5,10,2);
        System.out.println("For B2");
        b2.volume();
    }
}
