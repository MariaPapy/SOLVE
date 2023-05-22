package org.example;

public class Solve3 {
    public static void main(String[] args) {
        decision(2.5, 10.5, 2.0, (a, b, c) -> (b * b) - (4 * a * c));
        decision(5.0, 2.0, 2.0, (a, b, c) -> (b * b) - (4 * a * c));
    }
    public static void decision(Double a, Double b, Double c, ToFloatBiFunction<Double> predicate) {
        System.out.print("при a = " + a + ", b = " + b + ", c = " + c + ": D = ");
        System.out.println(predicate.findDiscipt(a, b, c));
    }

}
