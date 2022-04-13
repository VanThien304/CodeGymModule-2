package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Nhập vào một năm.");
        year = scanner.nextInt();
        if(year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.printf("%d là năm nhuận.", year);

                    } else {
                    System.out.printf("%d là năm không nhuận.", year);
                }
            } else {
                System.out.printf("%d là năm nhuận.", year);
            }
        } else {
            System.out.printf("%d là năm không nhuận.", year);
        }
    }
}
