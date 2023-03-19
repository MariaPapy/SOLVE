import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        int n = in.nextInt();
        boolean a = true;
        int i = 2;
        int s = (int)Math.sqrt(n);
        while ((i<=s) & (a == true)) {
            if (n%i!=0) {
                a = true;
                i++;
            }
            else{
                a = false;
            }
        }
        if (a == true) {
            System.out.println("Число простое");
        }
        else {
            System.out.println("Число составное");
        }
    }
}
