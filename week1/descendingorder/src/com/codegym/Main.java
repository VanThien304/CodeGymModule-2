package com.codegym;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, i, j, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử của mảng");
        number = input.nextInt();

        int array[] = new int[number];
        System.out.println("Nhập vào các phần tử trong mảng: ");


        for (i = 0; i < number; i++)
            array[i] = input.nextInt();
        for (i = 0; i < (number - 1); i++){
            for (j = 0; j < number - i - 1;j++){
            if(array[j] < array[j + 1])
            {
                temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
               }
            }
        }

        System.out.println("Kết quả sau khi sắp xếp là thứ tự giảm dần là: ");
        for (i = 0;i < number; i++){
            System.out.print(array[i] + "\t");
        }
    }
}
