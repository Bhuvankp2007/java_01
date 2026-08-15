import java.util.Scanner;
public class demo2{
    int age;
    String name;
    public void input(){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the name");
        name=input.nextLine();
        System.out.println("enter the age");
        age=input.nextInt();
        input.close();
    }
    public void display(){
        System.out.println("name is :"+name);
        System.out.println("age is :"+age);
    }

}