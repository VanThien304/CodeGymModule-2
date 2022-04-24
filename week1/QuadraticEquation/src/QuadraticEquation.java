import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        System.out.println("Nhập a ");
    double a = sc.nextDouble();
        System.out.println("Nhập b ");
    double b = sc.nextDouble();
        System.out.println("Nhập c ");
    double c = sc.nextDouble();
    QuadracticEquation quadratic = new QuadracticEquation(a, b, c);

    // delta = b^2 - 4ac;
    // delta > 0 có 2 nghiệm -b +- Math.sqrt(b*b - 4*a*c)/2a;
    // delta < 0 vô nghiệm
    // delta = 0 có 1 nghiệm -b/2a
        if (quadratic.getDelta() >= 0) {
            double x1 = (-b + Math.sqrt(quadratic.getDelta()))/ (2* a);
            double x2 = (-b - Math.sqrt(quadratic.getDelta()))/ (2* a);
        System.out.println("Phương trình có 2 nghiệm: " + x1
                + " và "
                + x2);
    } else if (quadratic.getDelta() == 0) {
        System.out.println("Phương trình có 1 nghiệm: "
                + (-b / 2*a ));
    } else {
        System.out.println("Phương trình vô nghiệm!");
    }

}
public static class QuadracticEquation {
    private double a;
    private double b;
    private double c;

    public QuadracticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
    public double getDelta() {

        return Math.pow(b, 2) - 4 * a * c;
    }
}
}

