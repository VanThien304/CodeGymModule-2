package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    while (1 > 0){
        System.out.print("Nhập số cần đọc (0-999): ");
        String input = sc.nextLine();
        while(!(input.matches("^[1-9][0-9]?[]")))
    }
    }
}
