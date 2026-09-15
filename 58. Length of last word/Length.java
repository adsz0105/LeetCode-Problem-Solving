import java.util.Scanner;
public class Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int count = 0;
	String word = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if(ch != ' ') {
		word = ch + word;
                count++;
            } else if(count != 0) {
                break;
            }
        }
        System.out.println("The length of last word: " + word + " is " + count);
        sc.close();
    }
}