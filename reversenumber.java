import java.util.Scanner;
public class reversenumber {
    public static void main(String[] args){
        int n,reversed=0,rem;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");   
        n=sc.nextInt();
        sc.close();
        while(n!=0){
            rem=n%10;
            reversed=reversed*+rem;
            n=n/10;
        }
        System.out.println("reversed number is:"+reversed);
       }
       
}
