import java.util.Scanner;
public class sumOfnumbers {
    int n;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: "); 
        int sum = 0;
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}