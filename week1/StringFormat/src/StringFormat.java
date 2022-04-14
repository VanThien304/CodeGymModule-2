public class StringFormat {
    public static void main(String[] args) {
        System.out.printf("Integer: %d\n",15);
        System.out.printf("Số dấu phẩy động có 2 chữ số thập phân : %.2f \n ",1.21312232);
        System.out.printf("Số dấu phẩy động có 5 chữ số thập phân : %.5f \n ",1.21312232);
        System.out.printf("String: %s, integer: %d, float: %.2f, \n","Hello", 89,9.123456);
        System.out.printf("ádasdasdasd: %4$2s %1$2s %3$2s \n","a","b","c");
    }

}
