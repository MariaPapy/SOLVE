public class Main9 {
        public static void main(String[] args) {
            double a=1.5;
            double b=1.3;
            double c=1.8;
            double D = Math.pow(b,2)-4*a*c;
            if (D>0) {
                double x1 = -b + Math.sqrt(Math.pow(b, 2)- 4 * a * c);
                double x2 = -b - Math.sqrt(Math.pow(b, 2)- 4 * a *c);
                System.out.println(x1);
                System.out.println(x2);
            } else if (D == 0) {
                double x = -b / 2 * a;
                System.out.println(x);
            } else {
                System.out.println("Корней нет");
            }
        }
}
