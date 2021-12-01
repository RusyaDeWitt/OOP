package Week8;

import java.util.Scanner;

public class Square {

    public static int length;

    public Square() {
        length = 0;
    };
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of square:");
        length = sc.nextInt();

        print_area();
    };


    public static int area;

    public static void print_area(){
        area = length*length;
        System.out.print(area);
    };

    public static int display_area(){
        area = length*length;
        return area;
    };


}
