package javalab;

import java.util.Scanner;

public class Calculator {
    int n1;
    int n2;
    //method for getting data
    public void getdata() {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter n1");
        this.n1 = scrn.nextInt();
        System.out.println("Enter n2");
        this.n2 = scrn.nextInt();
    }
    //method for adding
    public void add() {
        System.out.println(this.n1 + this.n2);
    }

    //method for subtraction
    public void sub() {
        System.out.println(this.n1 - this.n2);
    }

    //method for multiplication
    public void mul() {
        System.out.println(this.n1 * this.n2);
    }

    //method for division
    public void div() {
        System.out.println((float) this.n1 /(float) this.n2);
    }

    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        Calculator c1 = new Calculator();
        int n;
        c1.getdata();
        do {
            System.out.println("Enter the operation you want to perform " +
                    "\n1.Addition\n2.subtraction\n3.multiply\n4.division\n5.exit");
            n = scrn.nextInt();
            switch (n) {
                case 1:
                    c1.add();
                    break;
                case 2:
                    c1.sub();
                    break;
                case 3:
                    c1.mul();
                    break;
                case 4:
                    c1.div();
                    break;
                case 5:
                    break;

            }
        }while(n!=5);
    }
}
