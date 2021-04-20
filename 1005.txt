import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
      
        double a,b,med;
        
        Scanner sc = new Scanner(System.in);
       a = sc.nextDouble();
       b = sc.nextDouble();
    
       med = ((a*3.5) + (b*7.5))/11.0;
       
       System.out.printf("MEDIA = %.5f\n",med);
 
    }
 
}