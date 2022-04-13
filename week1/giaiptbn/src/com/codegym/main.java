package com.codegym;

import java.util.Scanner;
public class main {

    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc nhất!");
        System.out.println("Phương trình 'a * x + b = c, nhập các hằng số: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        if(a != 0){
            double answer = (c - b)/a;
            System.out.printf("Phương trình có nghiệm x = %f!\n", answer);
        }else{
            if (b == 0){
                System.out.printf("Phương trình có vô số nghiệm");
            }else{
                System.out.printf("Phương trình vô nghiệm!");
            }

        }


    }
}
