package com.codegym;
import java.util.Scanner;
public class NumberToWord {
    public static void units (int n) {
        switch (n) {
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
        }
    }

    public static void special (int n) {
        switch (n) {
            case 11:
                System.out.print("Eleven ");
                break;
            case 12:
                System.out.print("Twelve ");
                break;
            case 13:
                System.out.print("Thirteen ");
                break;
            case 14:
                System.out.print("Fourteen ");
                break;
            case 15:
                System.out.print("Fifteen ");
                break;
            case 16:
                System.out.print("Sixteen ");
                break;
            case 17:
                System.out.print("Seventeen ");
                break;
            case 18:
                System.out.print("Eighteen ");
                break;
            case 19:
                System.out.print("Nineteen ");
                break;
        }
    }

    public static void tens (int n) {
        switch (n) {
            case 1:
                System.out.print("Ten ");
                break;
            case 2:
                System.out.print("Twenty ");
                break;
            case 3:
                System.out.print("Thirty ");
                break;
            case 4:
                System.out.print("Forty ");
                break;
            case 5:
                System.out.print("Fifty ");
                break;
            case 6:
                System.out.print("Sixty ");
                break;
            case 7:
                System.out.print("Seventy ");
                break;
            case 8:
                System.out.print("Eighty ");
                break;
            case 9:
                System.out.print("Ninety ");
                break;
        }
    }

    public static void hundred (int n) {
        switch (n) {
            case 1:
                System.out.print("One Hundred ");
                break;
            case 2:
                System.out.print("Two Hundred ");
                break;
            case 3:
                System.out.print("Three Hundred ");
                break;
            case 4:
                System.out.print("Four Hundred ");
                break;
            case 5:
                System.out.print("Five Hundred ");
                break;
            case 6:
                System.out.print("Six Hundred ");
                break;
            case 7:
                System.out.print("Seven Hundred ");
                break;
            case 8:
                System.out.print("Eight Hundred ");
                break;
            case 9:
                System.out.print("Nine Hundred ");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number [from 0 to 999]>> ");
        int number = input.nextInt();

        while (number < 0 || number > 999) {
            System.out.println("Input invalid");
            System.out.println("Enter a number [from 0 to 999]>> ");
            number = input.nextInt();
        }

        if(number>99 && number<1000) {
            int H = number/100;
            hundred(H);

            int x = number%100;
            if(x>10 && x<20){
                special(x);
            }

            if (x>19 && x<100){
                int tens = x/10;
                tens(tens);
                int units = x%10;
                units(units);
            }

            if(x<11) {
                int tens = x/10;
                tens(tens);
                int units = x%10;
                units(units);
            }

        }

        if (number>19 && number<99) {
            int tens = number/10;
            tens(tens);
            int u = number%10;
            units(u);
        }
        if (number>10 && number <20) {
            special(number);
        }
        if (number<11) {
            int te = number/10;
            tens(te);
            units(number);
        }
    }
}
