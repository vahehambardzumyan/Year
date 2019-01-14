import java.sql.SQLOutput;
import java.util.Scanner;


public class year {

    public static void main(String[] args) {
        System.out.println("Please enter year");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("Please enter month");
        int b = scanner.nextInt();

        int monthString;
        int v;
        if (a % 4 == 0 && b == 2) {
            v = 29;
        } else v=28;
        switch (b) {
            case 1:
                monthString = 31;
                break;
            case 2:
                monthString = v;
                break;
            case 3:
                monthString = 31;
                break;
            case 4:
                monthString = 30;
                break;
            case 5:
                monthString = 31;
                break;
            case 6:
                monthString = 30;
                break;
            case 7:
                monthString = 31;
                break;
            case 8:
                monthString = 31;
                break;
            case 9:
                monthString = 30;
                break;
            case 10:
                monthString = 31;
                break;
            case 11:
                monthString = 30;
                break;
            case 12:
                monthString = 31;
                break;
            default:
                monthString = 0;
                break;
        }

        System.out.println(monthString);

        }
    }

