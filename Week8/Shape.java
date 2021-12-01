package Week8;

public class Shape {

    public static int area;
    public static void main(String [] args){
        System.out.println("Code Started");
    };

    public Shape(){
        int area = 0;
    };

    public static void print_area(int area){
        System.out.print(area);
    };

    public static int display_area(int area){
        return area;  
    };
}
