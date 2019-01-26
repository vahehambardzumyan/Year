import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        int a = scanner1.nextInt();
        int b = scanner3.nextInt();
        String v = scanner2.nextLine();

        System.out.println(calculate(a, b ,v));

    }
    public static int calculate(int a, int b,String v) {
        if (v == "+") {
            return (a+b);
        } else if (v == "-") {
            return (a - b);
        } else if (v == "*") {
            return (a * b);
        } else if (v == "/") {
            return (a/b);
        } else return 2;
    }
}