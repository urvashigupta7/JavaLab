package javalab.javalab4;

import java.util.Scanner;

public class Multiple {
    private int a=10;
    private int b;
    private int[] arr=new int[2];
    public void method1(){
        System.out.println(a/b);
        System.out.println(arr[3]);
    }
    public void getb(){
        Scanner scrn=new Scanner(System.in);
        System.out.println("Enter the value of b");
        b=scrn.nextInt();
    }

    public static void main(String[] args) {
        Multiple m=new Multiple();
        try{
            m.getb();
            m.method1();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }
}
