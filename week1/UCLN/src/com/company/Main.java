package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
    int b;
        Scanner nhapdulieu = new Scanner(System.in);
        System.out.println("Nhập a");
        a = nhapdulieu.nextInt();
        System.out.println("Nhập b");
        b = nhapdulieu.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 || b == 0){
            System.out.println("Không có UCLN");
        }
        while (a != b){
            if(a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("UCLN là: " + a);
    }
}
