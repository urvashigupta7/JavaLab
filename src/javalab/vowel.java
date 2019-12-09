package javalab;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.println("Enter the character");
        char n = scrn.next().charAt(0);

        switch (n) {
            case 'a':
                System.out.println("given char is a vowel");
                break;
            case 'e':
                System.out.println("given char is a vowel");
                break;
            case 'i':
                System.out.println("given char is a vowel");
                break;
            case 'o':
                System.out.println("given char is a vowel");
                break;
            case 'u':
                System.out.println("given char is a vowel");
                break;
                default:
                    System.out.println("given char is a consonant");
        }
    }
}
