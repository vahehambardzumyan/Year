import java.util.Scanner;

public class Arrayy {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = {200, 500, 600, 700};
        int b = scanner.nextInt();
        a[b] = ar10(a, b);
        int i;
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static int ar10(int[] a, int b) {
        a[b] = a[b] * 110 / 100;
        return a[b];
    }

}
