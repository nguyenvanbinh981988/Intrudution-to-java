import java.util.Scanner;

public class Ung_dung_doc_so_thanh_chu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number");
        int Num = scanner.nextInt();
        int a = -1;
        int b = -1;
        int c = -1;
        String ones, tens, hundred;
        if (Num <= 10) {
            a = Num;
        } else if (Num < 100) {
            b = Num / 10;
            a = Num - (b * 10);
        } else if (Num < 1000) {
            c = Num / 100;
            b = (Num - c * 100) / 10;
            a = (Num - c * 100 - b * 10);
        }

        switch ( a ) {
            case 1:
                ones = "one";
                break;
            case 2:
                ones = "Two";
                break;
            case 3:
                ones = "three";
                break;
            case 4:
                ones = "four";
                break;
            case 5:
                ones = "fire";
                break;
            case 6:
                ones = "six";
                break;
            case 7:
                ones = "seven";
                break;
            case 8:
                ones = "eight";
                break;
            case 9:
                ones = "nine";
                break;
            case 10:
                ones = "ten";
                break;
           default:
                ones = "";
               break;
        }

        if (b==1){
            tens = "";
            switch (a) {
                case 1:
                    ones="eleven";
                    break;
                case 2:
                    ones = "twelve";
                    break;
                case 3:
                    ones="thirteen";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    ones=a + "teen";
                    break;
                default:
                    ones="";
                    break;
            }
        } else {
            switch (b) {
                case 2:
                    tens = "twenty";
                    break;
                case 3:
                    tens = "thirty";
                    break;
                case 4:
                    tens = "forty";
                    break;
                case 5:
                    tens = "fifty";
                    break;
                case 6:
                    tens = "sixty";
                    break;
                case 7:
                    tens = "seventy";
                    break;
                case 8:
                    tens = "eighty";
                    break;
                case 9:
                    tens = "ninety";
                    break;
                default:
                    tens = "";
                    break;
            }
        }

        switch (c) {
            case 1:
                hundred = "one hundred";
                break;
            case 2:
                hundred = "two hundred";
                break;
            case 3:
                hundred = "three hundred";
                break;
            case 4:
                hundred = "four hundred";
                break;
            case 5:
                hundred = "five hundred";
                break;
            case 6:
                hundred = "six hundred";
                break;
            case 7:
                hundred = "seven hundred";
                break;
            case 8:
                hundred = "eight hundred";
                break;
            case 9:
                hundred = "nine hundred";
                break;
            default:
                hundred = "";
                break;
        }



        if (Num <= 10) {
            System.out.println(ones);
        } else if (Num < 100) {
            System.out.println(tens +" "+ ones);
        } else if (Num < 1000) {
            System.out.println(hundred+" "+tens+" "+ones);
        }

    }
}
