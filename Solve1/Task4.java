public class Main4 {
    public static void main(String[] args) {
        int n=123;
        int s=(n%10)+((n/10)%10)+(n/100);
        System.out.println("Сумма цифр числа "+n+ "="+s);
    }
}
