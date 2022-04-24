package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ và tên: ");
     String hoVaTen = scanner.nextLine();

        System.out.println("Nhập mã sinh viên: ");
        long maSinhVien = scanner.nextLong();

        System.out.println("Nhập điểm thi: ");
        double diemThi = scanner.nextDouble();

        System.out.println("Họ và tên: " + hoVaTen);
        System.out.println("Mã sinh viên: " + maSinhVien);
        System.out.println("Nhập điểm thi: " + diemThi);
    }
}