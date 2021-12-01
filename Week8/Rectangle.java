package Week8;

import java.util.Scanner;

public class Rectangle {
    public static int length;
    public static int breadth;
    public static void main(String[] args){
        System.out.println("Enter Length and Breadth");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt();
        int breadth = sc.nextInt();

        print_area();
        System.out.print(display_area());
    };

    public static void print_area(){
        int area = length * breadth;
        System.out.print(area);
    };

    
    public static int display_area(){
        int area = length * breadth;
        return area;
    }
}
