// Java Program to illustrate the
// addition of elements in a List
import java.util.*;
public class test {
    public static void main(String args[]) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("1", "2");
        map.put("minus", "minus"); // 1
        map.put("window", "window"); // 2
        map.put("3", "ball");
        map.put("Aibek", "Aibek"); //3
        map.put("car", "Toyota");
        map.put("light", "light"); // 4
        int sum = 0;
        for (Map.Entry m : map.entrySet()) {
            if(m.getKey() == m.getValue()){
                System.out.println(m.getKey() +" "+ m.getValue());
                sum++;
            }
        }
        System.out.println("Ruslan Kashayev");
        System.out.println(sum);
        // Task: 
        // Output:
        // Count: 
    }
}