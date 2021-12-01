package week9;
import java.io.PrintWriter;
import java.io.File;

public class Errors {
     public static boolean check(String field){
         if(field == ""){
             PrintWriter writer = new PrintWriter(new File("D:\\OOP\\week9\\error.text"));
             writer.write("Error , field is empty!");
             writer.flush();
             return false;
         }else{
             return true;
         }
     }
}
