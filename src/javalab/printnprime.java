package javalab;

import java.util.Scanner;

public class printnprime {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1000];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = true;
        }
        for (int p = 2; p * p < prime.length; p++) {
            if (prime[p]) {
                for (int i = p * p; i < prime.length; i += p) {
                    prime[i] = false;
                }
            }
        }
        Scanner scrn = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = scrn.nextInt();
        int count = 0;
        for (int i = 2; i < prime.length; i++) {
            if (count == n) {
                break;
            }
            if(prime[i] == true){
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
