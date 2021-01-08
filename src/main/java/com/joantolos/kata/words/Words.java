package com.joantolos.kata.words;

import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        String input;
        do {
            System.out.println("\nEscriu: > ");
            input = new Scanner(System.in).nextLine();
            if(!input.equals("exit")) {
                System.out.println("Has escrit: " + input);
            }
        } while (!input.equals("exit"));
    }
}
