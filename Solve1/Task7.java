import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = in.nextInt();
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.println("Первые "+n+" числа Фибоначчи:");
        System.out.println(1);
        System.out.println(1);
        for (int i = 3; i <= n; i++) {
            n2 = n0 + n1;
            System.out.println(n2+ " ");
            n0 = n1;
            n1 = n2;
        }
    }
}
