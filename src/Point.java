import java.util.Scanner;

public class Point{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(number(a));
    }

    public static int number(int a) {
        int b;
        b=a*17/100;
        return b;
    }

}
