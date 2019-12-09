package javalab.javalab4;

import java.util.Scanner;

public class Finally2 {
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
        Finally2 m=new Finally2();
        try{
            m.getb();
            m.method1();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Inside the finally block");
        }

    }
}
