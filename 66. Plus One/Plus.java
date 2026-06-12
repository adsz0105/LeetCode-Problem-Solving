import java.util.Scanner;
class Plus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n]; 
        System.out.print("Enter the digits: ");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        if (digits[n - 1] != 9) {
            digits[n - 1]++;
        } else {
            digits[n - 1] = 0;
            int i;
            for (i = n - 2; i >= 0; i--) {
                if (digits[i] != 9) {
                    digits[i]++;
                    break;
                }
                digits[i] = 0;
            }
            if (i < 0) {
                int[] ans = new int[n + 1];
                ans[0] = 1;
                digits = ans;
            }
        }
        System.out.print("Result: ");
        for (int num : digits) {
            System.out.print(num + " ");
        }
	System.out.println(" ");
        sc.close();
    }
}