import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // * Bai 1
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your name:");
//        String name = scanner.nextLine();
//        System.out.println("Hello: " + name);

        // * Bai 2
//        System.out.println("Enter your USD:");
//        float USD = scanner.nextFloat();
//        float VND = USD * 23000;
//        System.out.println(VND + " VND");

        // * Bai 3
        System.out.println("Nhập 1 số có 3 chữ số:");
        int num = scanner.nextInt();
        int tram = num / 100;
        int chuc = num % 100 / 10;
        int donvi = num % 10;
        String chu = "";
        if (num >= 0 && num < 999) {
            switch (tram) {
                case 1:
                    chu = "One hundred";
                    break;
                case 2:
                    chu = "Two hundred";
                    break;
                case 3:
                    chu = "Three hundred";
                    break;
                case 4:
                    chu = "Four hundred";
                    break;
                case 5:
                    chu = "Five hundred";
                    break;
                case 6:
                    chu = "Six hundred";
                    break;
                case 7:
                    chu = "Seven hundred";
                    break;
                case 8:
                    chu = "Eight hundred";
                    break;
                case 9:
                    chu = "Nine hundred";
                    break;
            }
            if (tram != 0 && (chuc != 0 || donvi != 0)) {
                chu += " and ";
            }
            if (chuc >= 2) {
                switch (chuc) {
                    case 2:
                        chu += "twenty";
                        break;
                    case 3:
                        chu += "thirty";
                        break;
                    case 4:
                        chu += "forty";
                        break;
                    case 5:
                        chu += "fifty";
                        break;
                    case 6:
                        chu += "sixty";
                        break;
                    case 7:
                        chu += "seventy";
                        break;
                    case 8:
                        chu += "eighty";
                        break;
                    case 9:
                        chu += "ninety";
                        break;
                }
            } else if (chuc == 1) {
                switch (donvi) {
                    case 0:
                        chu += "Ten";
                        break;
                    case 1:
                        chu += "Eleven";
                        break;
                    case 2:
                        chu += "Twelve";
                        break;
                    case 3:
                        chu += "Thirteen";
                        break;
                    case 4:
                        chu += "Fourteen";
                        break;
                    case 5:
                        chu += "Fifteen";
                        break;
                    case 6:
                        chu += "Sixteen";
                        break;
                    case 7:
                        chu += "Seventeen";
                        break;
                    case 8:
                        chu += "Eighteen";
                        break;
                    case 9:
                        chu += "Nineteen";
                        break;
                }
            }
            if (chuc != 1) {
                switch (donvi) {
                    case 1:
                        chu += "One";
                        break;
                    case 2:
                        chu += "Two";
                        break;
                    case 3:
                        chu += "Three";
                        break;
                    case 4:
                        chu += "Four";
                        break;
                    case 5:
                        chu += "Five";
                        break;
                    case 6:
                        chu += "Six";
                        break;
                    case 7:
                        chu += "Seven";
                        break;
                    case 8:
                        chu += "Eight";
                        break;
                    case 9:
                        chu += "Nine";
                        break;
                }
            }
        } else {
            System.out.println("Out of ability!");
        }
        System.out.println(chu);
    }
}
