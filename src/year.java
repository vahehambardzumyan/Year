import java.sql.SQLOutput;
import java.util.Scanner;


public class year {

    public static void main(String[] args) {
        int[] a = {1, 5, 8, 9};
        int b=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b) b = a[i];
        }
        System.out.println(b);

    }
}

