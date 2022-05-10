import java.util.Scanner;

public class Kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so nam vao: ");
        int a = scanner.nextInt();

        if (a % 4 == 0) {
            if (a % 100 == 0) {
                if (a % 400 == 0) {
                    System.out.println(a + " is a leap year");
                } else {
                    System.out.println(a + " isn't a leap year");
                }
            } else {
                System.out.println(a + " is a leap year");
            }
        }else {
            System.out.println(a + " isn't a leap year");
        }
    }
}
