package com.joantolos.kata.words;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Words {

    public static void main(String[] args) throws InterruptedException {
        String input;
        do {
            System.out.println("\nEscriu: >");
            input = new Scanner(System.in).nextLine();
            if(!input.equals("exit")) {
                System.out.println("Has escrit: \n . . .");
                TimeUnit.SECONDS.sleep(2);
                System.out.println(input);
            }
        } while (!input.equals("exit"));
    }
}
