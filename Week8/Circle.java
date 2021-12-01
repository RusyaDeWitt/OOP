package Week8;

import Week8.Shape;
import java.util.Scanner;



public class Circle extends Shape{
    public static int radius;

    public static void main(String [] args){
        System.out.println("Circle class");
        System.out.println("Enter radius: ");

        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();

        print_area();

        System.out.print(display_area());
    }

    public Circle(int radius){
        radius = 0;
    };


    public static void print_area(){
        System.out.println("Area of Circle is:");
        int area = 3*(radius*radius);
        System.out.print(area);
    };
    
    public static int display_area(){
        int area = 3*(radius*radius);
        return area;
    }

}
