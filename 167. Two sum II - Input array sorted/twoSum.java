import java.util.Scanner;
public class twoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.print("Enter elements in sorted order:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int start = 0;
        int end = numbers.length - 1; //can write = n also

        while (start < end) {
            int sum = numbers[start] + numbers[end];

            if (sum == target) {
                System.out.println("Indices: [" + (start + 1) + ", " + (end + 1) + "]");
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }
        sc.close();
    }
}