import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn muốn:");
        int month = scanner.nextInt();
        if (month > 0 && month < 13) {
            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Tháng " + month + " có 30 ngày.");
                    break;
                case 2:
                    System.out.println("Tháng " + month + " có 28 hoặc 29 ngày.");
                    break;
                default:
                    System.out.println("Tháng " + month + " có 31 ngày.");
                    break;
            }
        } else {
            System.out.println("Tháng này không tồn tại.");
        }
    }
}
