import java.util.Scanner;
public class Solution {
    public static void main(String[] args) { 
	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
	int x = sc.nextInt();
	Solution obj = new Solution();
        if (obj.isPalindrome(x)) {
            System.out.println(x + " is a palindrome.");
        } else {
            System.out.println(x + " is not a palindrome.");
        }
	sc.close();
    }

    boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int n = x;
        int revNum = 0;

        while (n > 0) {
            int d = n % 10;
            revNum = revNum * 10 + d;
            n /= 10;
        }
        return x == revNum;
    }
}