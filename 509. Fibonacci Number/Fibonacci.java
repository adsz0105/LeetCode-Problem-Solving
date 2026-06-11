import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the iteration number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Fibonacci number: 0");
        } else if (n == 1) {
            System.out.println("Fibonacci number: 1");
        } else {
            int firstTerm = 0;
            int secondTerm = 1;

            for (int i = 2; i <= n; i++) {
                int thirdTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
            }
            System.out.println("Fibonacci number: " + secondTerm);
        }
        sc.close();
    }
}