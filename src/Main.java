import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số: ");
//        int newNumber = scanner.nextInt();
//        System.out.println(newNumber + 30);

        // Tìm số lớn nhất trong 3 số:
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào số A:");
//        int a = scanner.nextInt();
//        System.out.println("Nhập vào số B:");
//        int b = scanner.nextInt();
//        System.out.println("Nhập vào số C:");
//        int c = scanner.nextInt();
//
//        int max = 0;
//        max = a > b ? (a > c ? a : c) : (b > c ? b : c);
//        System.out.println("Số lớn nhất là: " + max);

        // * Hiển thị ngày trong máy tính
//        Date date = new Date();
//        System.out.println("Time now:" + date);

        // ? Tính chỉ số BMI
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Your weight (in kilogram):");
        weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);
        int a = 0;
        System.out.printf("%-20s%s", "bmi" , "Interpretation\n");
        if (bmi < 18) {
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        } else if (bmi < 25.0) {
            System.out.printf("%-20.2f%s", bmi, "normal");
        } else if (bmi < 30.0) {
            System.out.printf("%-20.2f%-50s", bmi, "Overweight");
        } else {
            System.out.printf("%-20.2f%s", bmi, "Obese");
        }
    }
}