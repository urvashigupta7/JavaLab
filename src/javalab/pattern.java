package javalab;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        int n = scrn.nextInt();
        int row = 0;
        int col = 0;
        int spaces = n - 1;
        int stars = 1;
        while (row < n) {
            col = 0;
            int val = 1;
            while (col < spaces) {
                System.out.print(" ");
                col++;
            }
            col = 0;
            while (col < stars) {
                System.out.print(val);
                col++;
                if (col <= stars / 2) {
                    val++;
                } else {
                    val--;
                }
            }
            spaces--;
            stars += 2;
            row++;
            System.out.println();
        }
    }
}
