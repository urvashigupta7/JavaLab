package javalab;

import java.util.Scanner;

public class reverseofnumber {
    public static void main(String[] args) {
        Scanner scrn=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=scrn.nextInt();
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        System.out.println("reverse of the number is "+rev);
    }
}
