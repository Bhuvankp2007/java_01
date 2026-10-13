import java.util.Scanner;
public class demo4 {
    public static void main(String[] args){
        int  n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        n=sc.nextInt();
        sc.close();
        if (n<0){
            System.out.println("negative number");
        }
        else if (n>0){
            System.out.println("positive number");
        }
        else{
            System.out.println("zero");
        }


 }    
}
