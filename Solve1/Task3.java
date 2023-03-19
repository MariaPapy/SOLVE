import java.util.Scanner;
public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число ");
        String s = in.nextLine();
        int k=0;
        for (int i = 0; i<s.length()/2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - i - 1)) {
                k=k+1;
            }
        }
        if (k==s.length()/2) {
            System.out.println("Является палиндромом");
        }
        else {
            System.out.println("Не является палиндромом");
        }
    }

}
