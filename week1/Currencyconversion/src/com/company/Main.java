package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	double vnd = 23000;
    double usd;
    Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double quidoi = usd * 23000;
        System.out.print("Giá trị VND: " + quidoi);
    }
}
