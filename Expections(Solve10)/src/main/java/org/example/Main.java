package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Multiply multiply = new Multiply();
        while (a != 0 && b != 0) {
            try {
                System.out.println(multiply.umn(a, b));
            } catch (NotEvenExceptions e) {
                System.out.println("Ошибка!");;
            } finally {
                System.out.println("Но ты все равно молодец!");
            }
            a = scanner.nextInt();
            b = scanner.nextInt();

        }
    }
}