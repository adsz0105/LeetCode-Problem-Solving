import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int original = n;

        if (n < 1) {
            System.out.println("The entered number " + original + " is not a power of two");
        } else {
            while (n % 2 == 0) {
                n /= 2;
            }

            if (n == 1) {
                System.out.println("The entered number " + original + " is a power of two");
            } else {
                System.out.println("The entered number " + original + " is not a power of two");
            }
        }
        System.out.println();
        sc.close();
    }
}