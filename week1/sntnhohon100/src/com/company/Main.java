package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Các SNT nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++){
            int count = 0;

            for(int j = 1; j <= i;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.print(" " + i );
            }
        }
    }
}
