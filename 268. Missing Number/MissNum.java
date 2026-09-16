import java.util.Scanner;
public class missNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int actualSum = (n * (n + 1)) / 2;
        int currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];
        }

        int missNum = actualSum - currentSum;
        System.out.println("Missing number: " + missNum);
        sc.close();
    }
}