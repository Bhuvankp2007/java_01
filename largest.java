import java.util.Scanner; 
public class  largest{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the 3 number to find largest of 3");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
        input.close();
        
        if  (a>=b&&a>=c){
            System.out.println("largest of 3 is "+a);
        }
        else if(b>=a&&b>=c){
            System.out.println("largest of 3 is "+b);
        }
        else{
            System.out.println("largest of 3 is "+c);
        }

    }
}