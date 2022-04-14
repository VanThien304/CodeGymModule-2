package com.codegym;
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số để kiểm tra SNT! ");
        int number = sc.nextInt();
        if(number < 2){
            System.out.println(number + " không phải là SNT");
        } else {
            int i = 2;
            boolean check = true;
            while (i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " là một SNT");
            else
                System.out.println(number + " không phải là một SNT");
        }
    }
}