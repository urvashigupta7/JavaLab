package javalab;

public class Dynamic {
    public static void print()
    {
        System.out.println("Base class print method");
    }

}
   class Dispatch extends Dynamic {
    public static void print() {
        System.out.println("Derived class print method");
    }

    public static void main(String[] args) {
        Dynamic dynamic = new Dynamic();
        dynamic.print();

        Dispatch dispatch = new Dispatch();
        dispatch.print();

        dynamic = dispatch;
        dynamic.print();
    }
}
