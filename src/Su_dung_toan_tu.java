import java.util.Scanner;

public class Su_dung_toan_tu {
    public static void main(String[] args) {
        float height;
        float width;

        Scanner scanner = new Scanner(System.in); // Khai bao doi tuong Scanner

        System.out.println("Width is: ");
        width = scanner.nextFloat(); // nhap chieu rong

        System.out.println("Height is: ");
        height = scanner.nextFloat(); // nhap chieu rong

        float area = height * width;

        System.out.println("Area is : " + area);
    }
}
