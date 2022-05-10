import java.util.Scanner;

public class Giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Give a equation as 'a*x + b = c',please enter constants");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        float a = scanner.nextFloat();

        System.out.println("Enter b: ");
        float b = scanner.nextFloat();

        System.out.println("Enter c: ");
        float c = scanner.nextFloat();

        if (a != 0){
            float x = (c - b)/a;
                    System.out.println("phuong trinh co nghiem la: x = "+ x);
        } else {
            if (b == c){
                System.out.println("phuong trinh co vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        }
    }
}
