package org.example;

public class Solve1 {
    public static void main(String[] args) {
        evaluate(0, n -> n % 13 == 0);
        evaluate(13, n -> n % 13 == 0);
        evaluate(169, n -> n % 13 == 0);
    }
    public static void evaluate(int n, IntToBool<Integer> predicate) {
        System.out.print(n + " ");
        System.out.println(predicate.applyAsBool(n));
    }
}