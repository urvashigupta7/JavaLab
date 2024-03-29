package javalab;

public class Test {
    static int i;//static data member
    static int j=10;

    // start of static block
    static {
        i = 10;
        System.out.println("static block called ");
    }
    // end of static block

    //static member function
    static void getj()
    {
        System.out.println(j);
    }

    public static void main(String args[]) {

        // Although we don't have an object of Test, static block is
        // called because i is being accessed in following statement.
        System.out.println(Test.i);

        //static member function called
        System.out.println("static member function called ");
        Test.getj();

    }

}
