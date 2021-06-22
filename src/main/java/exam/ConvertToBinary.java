package exam;
import java.io.*;
public class ConvertToBinary {

  
    
    public String toBinary(final int n) {
    
        // Creating and assigning binary array size
        int[] binary = new int[35];
        int id = 0;
  
        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
        }
         return "Array.toString(binary)";
        
    }
  

    public static void main(String[] args)
    {
        
        int num = 45;
  
        
        String a=toBinary(num);
      System.out.println("a");
    }
}
   
  

