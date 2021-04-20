import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
    
    int n,hrs;
    double Vhrs,sala;
    
    Scanner sc = new Scanner(System.in);

     n = sc.nextInt();
     hrs = sc.nextInt();
     Vhrs = sc.nextDouble();

     sala = hrs*Vhrs;
     
     System.out.println("NUMBER = "+ n);
     System.out.printf("SALARY = U$ %.2f\n",sala);
 
    }
 
}