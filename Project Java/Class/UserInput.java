package Class;
import java.util.Scanner;

public class UserInput {
    public static void main(String[]args){
        Scanner myName = new Scanner(System.in);
        Scanner myAge = new Scanner(System.in);

        System.out.println("Enter your name:");
        String userName = myName.nextLine();

        System.out.println("Enter your age:");
        int userAge = myAge.nextInt();

        System.out.println("My name is "+userName+" and I'm "+userAge+" years old");
    }
}
