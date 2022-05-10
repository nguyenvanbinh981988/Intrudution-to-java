import java.util.Scanner;

public class Tinh_so_ngay_trong_thang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which month that you want to count day?");
        int month = scanner.nextByte();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("this month have 31 days");
                break;
            case 2:
                System.out.println("this month have 28 or 29 day");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("this month have 30 day");
                break;
            default:
                System.out.println("this month don't have in calender");
                break;
        }
    }
}
