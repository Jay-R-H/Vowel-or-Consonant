package com.programming;

import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabet :");
        char alpha = sc.next().charAt(0);

        if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u'){
            System.out.println("The alphabet is an vowel");
        }
        else {
            System.out.println("The alphabet is a constant");
        }
    }
}
