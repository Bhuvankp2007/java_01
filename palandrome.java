import  java.util.Scanner;
public class palandrome {
    public static void main(String[] args){
        int n,rem,rev=0,temp;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        sc.close();
        temp=n;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("palandrome number");
        }
        else{
            System.out.println("not a palandrome number");
        }
    }
}