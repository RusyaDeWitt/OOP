package week9;
import java.util.Scanner;

public class User {
    String name;
    String id;
    String phone_number;

    User(){
        name = "";
        id = "";
        phone_number = "";
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Errors errors = new Errors();

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter id: ");
        String id = sc.nextLine();

        System.out.println("Enter phone number: ");
        String phone_number = sc.nextLine();

        if(errors.check(name) == false){
            System.out.println("Error! Field name cannot be empty!");
        }
        if(errors.check(id) == false){
            System.out.println("Error! Field id cannot be empty!");
        }
        if(errors.check(phone_number) == false){
            System.out.println("Error! Field phone number cannot be empty!");
        };

    };
}
