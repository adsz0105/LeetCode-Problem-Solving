import java.util.Scanner;
public class Bottles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of bottles: ");
        int numBottles = sc.nextInt();
        System.out.print("Enter number of bottles required for exchange: ");
        int numExchange = sc.nextInt();
        int ans = numBottles;
        while(numExchange <= numBottles) {
            int newBottles = numBottles / numExchange;
            int remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        System.out.println("Total bottles drunk: " + ans);
        sc.close();
    }
}
