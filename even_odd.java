import java.util.Scanner; 
public class even_odd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to check even or odd");
        int num=input.nextInt();
        input.close();
        if (num%2==0){
            System.out.println("the given number is  even");
        }
            else {
                System.out.println("the given number is odd");

            
        }

    }



    
}
