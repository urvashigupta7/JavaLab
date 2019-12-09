package javalab;

public class Box2 {
    //instance variables
    int length;
    int width;
    int height;

    //function to getdata for boxes
    public void getdata(int length,int width,int height){
        this.length=length;
        this.width=width;
        this.height=height;
    }

    //function to compute volume with return statement
    public int volume() {
         return length * width * height;
    }

    public static void main(String[] args) {
        Box2 b1 = new Box2();
        b1.getdata(5,3,4);
        System.out.println("For B1");
        System.out.println("Volume of the box is " + b1.volume());
        Box2 b2 = new Box2();
        b2.getdata(5,10,2);
        System.out.println("For B2");
        System.out.println("Volume of the box is " + b2.volume());
    }
}
