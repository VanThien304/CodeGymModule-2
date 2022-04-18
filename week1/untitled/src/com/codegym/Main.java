package com.codegym;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("Thien");
//        System.out.println("My name is: " + person.getName());
//    }
        Staff staff = new Staff();
        staff.setFullname("Phan Văn Thiện");
        System.out.println("FullName: " + staff.getFullname());

        staff.setEmail("thien.phanvan9846@gmail.com");
        System.out.println("Email: " + staff.getEmail());
    }
}