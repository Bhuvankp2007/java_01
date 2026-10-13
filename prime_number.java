import java.util.Scanner;
public class prime_number {
    public static void main(String[] args){
        int i,n,temp=0;
        Scanner sc =new Scanner(System.in);
        System .out.println("enter the number to check prime  or not");
        n=sc.nextInt();
        sc.close();
        for(i=2;i<n-1;i++){
            if(n%2!=0){
                temp=1;
            }
            
    }
    if(temp==1){
        System.out.println("prime number");

    }
    else{
        System.out.println("not a prime number");

    }
}
}