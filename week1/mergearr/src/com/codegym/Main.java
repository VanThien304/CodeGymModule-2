package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listOne = new int[4];
        int[] listTwo = new int[4];

        //sử dụng vòng lặp nhập các giá trị cho các phần tử trong mảng.
        System.out.print("Enter input value into array 1: ");
        for(int i = 0; i < listOne.length; i++){
            listOne[i] = scanner.nextInt();
        }
        System.out.print("Enter input value into array 2: ");
        for (int i = 0; i < listTwo.length;i++){
            listTwo[i] = scanner.nextInt();
        }
        int i = listOne.length + listTwo.length;
        int[] arr = new int[i];
        int count = 0;

        // duyệt mảng 1 để + vào mảng 2
        for(int j = 0; j < listOne.length; j++){
            arr[j] = listOne[j];
            count++;

        }
        for (int j = 0; j < listTwo.length;j++){
            arr[count++] = listTwo[j];
        }
        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j] + " ");
        }
    }

}

