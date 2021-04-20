import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	double raio,result,pi = 3.14159;
    	
    	Scanner sc = new Scanner(System.in);
    	raio = sc.nextInt();
    	result = (4/3.0)*pi*Math.pow(raio, 3);
    	System.out.printf("VOLUME = %.3f\n",result);
    }
 
}