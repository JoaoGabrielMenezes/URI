import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		double n = 3.14159;
		double a,r;
		
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		a = n * Math.pow(r,2);
		
	    System.out.printf("A=%.4f\n",a);
 
    }
 
}