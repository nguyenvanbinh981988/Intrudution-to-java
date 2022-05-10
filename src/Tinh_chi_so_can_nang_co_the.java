import java.util.Scanner;

public class Tinh_chi_so_can_nang_co_the {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so can nang: ");
        float a = scanner.nextFloat();

        System.out.println("Nhap chieu cao: ");
        float b = scanner.nextFloat();

        float BMI = a/(b*2);

        if (BMI < 18.5){
            System.out.println("Underweight");
        } else if(BMI < 25.0) {
            System.out.println("Normal");
        } else if(BMI < 30.0) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
