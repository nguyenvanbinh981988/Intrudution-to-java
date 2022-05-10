import java.util.Scanner;

public class Ung_dung_chuyen_doi_tien_te {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap so tien usd:");
        float usd = scanner.nextFloat();
        float vnd = usd*23000;
        System.out.println("So tien VND doi ra la: " + vnd + "VND");

    }
}
