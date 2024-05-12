import java.util.Scanner;

public class Teiler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, a;
        System.out.println("Enter a number");
        a = scan.nextInt();
        for (i = 1; i < a; i++) {
            if (a % i == 0) {
                System.out.println(i);
                System.out.println(a);
            }
        }

    }
}
