import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước của mảng: ");
            size = sc.nextInt();
            if(size > 20);
            System.out.println("Kích thước mảng không quá 20 phần tử");


        }while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("Nhập phần tử" + ( i + 1) + " : ");
            array[i] = sc.nextInt();
            i++;

        }
        System.out.print("Property list: ");
        for(int j = 1; j < array.length; j++){
            System.out.print(array[j] + "\t");

        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++){
            if(array[j] > max){
                max = array[j];
                index = j + 1;

            }
        }
            System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
