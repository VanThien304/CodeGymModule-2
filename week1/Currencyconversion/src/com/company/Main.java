package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        public static void main (String[]args){
            double vnd = 23000;
            double usd;
            Scanner sc = new Scanner(System.in);
            System.out.print("Mời bạn nhập số tiền USD: ");
            usd = sc.nextDouble();
            double quidoi = usd * 23000;
            System.out.print("Giá trị VND: " + quidoi);
        }


        public static void main(String[] args){
            for (int i = 2; i <= 9; i++) {
                for (int j = 1; j <= 10; j++) {
                    if (j > 5)
                        break;
                    System.out.println(i + " x " + j + " = " + (i * j));
                }
                System.out.println("---------");
            }
        }

