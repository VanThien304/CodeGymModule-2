package com.codegym;
import java.util.Scanner;
public class descending {
    public static void main(String[] args) {
        int size = 5;
        int a[] = {10, 20, -5, 2, 1};

        int temp = 0;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1;j < a.length;j++){
                if(a[j] < a[i]){
                    temp = a[j];
                    a[i] = a[j];
                    a[i] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++){
            System.out.printf("%d ",a[i]);

        }
    }
}
