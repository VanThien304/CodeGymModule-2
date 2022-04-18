package com.codegym;

public class Main {

    public static void main(String[] args) {
	BubbleSort ob = new BubbleSort();
    int arr[] = {5,1,4,2,8};
        System.out.println("Mảng ban đầu: ");
        ob.printArray(arr);
        ob.bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp: ");
        ob.printArray(arr);
    }
}
