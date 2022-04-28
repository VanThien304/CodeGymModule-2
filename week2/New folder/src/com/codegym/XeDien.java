package com.codegym;

abstract class XeDien {
    //hàm khởi tạo
    XeDien(){
        System.out.println("Xe điện được tạo");
    }
    // phương thức trừu tượng

    abstract void chay();

// phương thức không trừu tượng
    void thayPin(){
        System.out.println("Đã thay pin");
    }
}
