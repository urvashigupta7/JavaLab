package javalab;

import java.util.Scanner;

public class uptonprime {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1000000];
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
        int n = scrn.nextInt();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}
