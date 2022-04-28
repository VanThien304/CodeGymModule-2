package com.codegym;

 class Vinfast extends XeDien {
     @Override
     void chay() {
         System.out.println("Đang chạy ...");
     }
 }
 // tạo classs để gọi thử 2 loại phương thức
class TestLopTruuTuong{
     public static void main(String[] args) {
         XeDien xeDien = new Vinfast();
         xeDien.chay();
         xeDien.thayPin();
     }
 }
