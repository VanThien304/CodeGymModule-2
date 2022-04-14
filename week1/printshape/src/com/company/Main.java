package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("");
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        System.out.println("* * * * * * *");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 8; i++) {
                        System.out.println("");
                        for (int j = 1; j < i; j++) {
                            System.out.print("* ");

                        }

                    }
                break;
                case 3:
                    for(int i = 6; i >= 1; i--){
                        System.out.println("");
                        for (int j = 1; j <= i; j++){
                            System.out.print("* ");

                        }
                    }
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
                    break;
            }

        }
    }
}

