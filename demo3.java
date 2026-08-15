import java.util.Scanner;
public class demo3 {
    String[] name; // Declare the name variable as an instance variable
    void inputs(){
        
        Scanner input=new Scanner(System.in);
        System.out.println("enter 5 names:");
        name=new String[5];
        for(int i=0;i<5;i++){
            name[i]=input.nextLine();
        }
        input.close();
        
    }
    void displays(){
        for(int i=0;i<5;i++){
            System.out.println("name is :"+name[i]);
        }

    
    }
}
