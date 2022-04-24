package Delete;
import java.util.Scanner;
public class Delete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 25;
        arr[3] = 15;
        arr[4] = 30;
        arr[5] = 50;

        int size = arr.length;
        int n =6;

        System.out.println("Mảng trước khi xóa là: " + arr);
        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
        System.out.print("Nhập số cần xóa: ");
        int number = scanner.nextInt();

        n = deleteElenment(arr, n, number);

        System.out.print("Mảng sau khi xóa là: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static int deleteElenment(int [] arr, int n, int key){
        int position = searchElenment(arr, key);
        if(position == -1){
            System.out.println("Không tìm thấy phần tử để xóa!!!");
        }
        for(int i = position; i < n; i++){
            arr[i] = arr[i+1];

        }
        return n;
    }

    public static int searchElenment(int [] arr, int x){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }
        return -1;
    }
}

