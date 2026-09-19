import java.util.PriorityQueue;
import java.util.Scanner;

public class kLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (pq.size() < k) {
                pq.add(nums[i]);
            }
            else if (pq.peek() < nums[i]) {
                pq.remove();
                pq.add(nums[i]);
            }
        }

        System.out.println("The " + k + "th largest element is: " + pq.peek());
        sc.close();
    }
}