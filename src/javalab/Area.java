package javalab;

public class Area {
    //method to calculate area for square
    public static int area(int side) {
        return side * side;
    }
    //method to calculate area for rectangle
    public static double area(double length, double breadth) {
        return length * breadth;
    }
    //method to calculate area for triangle
    public static double area(float base, float height) {
        return (base * height) / 2;
    }

    public static void main(String[] args) {

        System.out.println("Area of square is " + area(8));
        System.out.println("Area of rectangle is " + area(3.2, 4));
        System.out.println("Area of triangle is " + area(10, 5));
    }
}
