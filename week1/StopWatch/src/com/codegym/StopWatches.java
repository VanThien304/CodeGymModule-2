package com.codegym;

import java.util.Random;

public class StopWatches {
    private static int max = 100;
    private static int min = 10;
    private long startTime;
    private long endTime;
    public StopWatches(){
        this.startTime = System.currentTimeMillis();
    }
    public void start() {
        startTime = System.currentTimeMillis();
    }
    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(i);
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;//searching for lowest index
                }
                System.out.printf("i: %d - j %d", i, j);
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static  int []  createArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            Random random = new Random();
            int a =  random.nextInt(max - min) + min;
            arr[i] = a;
        }
        return arr;
    }

    public static void main(String[] args) {
        StopWatches stopWatches = new StopWatches();


        int [] arrTest = createArray(1000000);
        //quickSort(arrTest, 0, 1000000 - 1);
        selectionSort(arrTest);
        stopWatches.stop();
        System.out.println(stopWatches.getElapsedTime()/1000);

    }
    // method to find the partition position
    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }

    static void quickSort(int array[], int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }

}
