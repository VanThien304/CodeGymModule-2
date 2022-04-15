package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String [] students = {"Christian", "Michael", "Camila", "Sienna", "Connor"};
	Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên của sinh viên: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for(int i = 0; i < students.length; i++){
            if(students[i].equals(input_name)){
                System.out.println("Vị trí của sinh viên trong danh sách" + input_name + "là: " +(i + 1));
                isExist = true;
                break;
            }
        }
        if(!isExist){
            System.out.println("Không tìm thấy" + input_name + " trong danh sách");

        }    }
}
