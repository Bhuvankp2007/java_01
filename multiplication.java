import java.util.Scanner;
public class multiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  number to create its multiplication table: ");
        int a = input.nextInt();
        input.close();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (a * i));
        }
    }
    
}
