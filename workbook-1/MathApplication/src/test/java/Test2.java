import java.sql.SQLOutput;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] asgr) {

        Scanner scanner = new Scanner (System.in);

        System.out.println("First Number : ");
        int mano = scanner.nextInt();

        System.out.println("Second Number : ");
        int galago = scanner.nextInt();

        int sumTotal = mano + galago;
        System.out.println("Total is " + sumTotal + " ");


    }
}