package org.example;

import java.util.Scanner;

public class Var {

    public String Var(){
        Scanner in = new Scanner(System.in);
        System.out.print(">");
        String str1 = in.nextLine();
        str1 = str1.toUpperCase();

        return str1;
    }
}