package com.codegym;

public class Main {

    public static void main(String[] args) {
        Staff staff = new Staff();
        staff.setFullname("Phan Văn Thiện");
        System.out.println("FullName: " + staff.getFullname());

        staff.setEmail("thien.phanvan9846@gmail.com");
        System.out.println("Email: " + staff.getEmail() );
    }
}
