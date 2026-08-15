import java.util.Scanner;
public class Student{
     public String Name;
    void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the name");
        this.Name=input.nextLine();
        input.close();

    }
    void display(){
        System.out.println("name is :"+Name);
    }

}