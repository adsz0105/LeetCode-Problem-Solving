import java.util.Scanner;
public class Tribonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the iteration number: ");
        int n = sc.nextInt();
	int result;
        if(n == 0){
            result = 0;
        } else if(n == 1 || n == 2){
            result = 1;
        } else {
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;

            for(int i = 3; i <= n; i++){
                int fourthTerm = firstTerm + secondTerm + thirdTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
            result = thirdTerm;
	}
	System.out.println("Tribonacci number: " + result);
        sc.close();
    }
}