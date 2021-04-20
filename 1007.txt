import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
    int a,b,c,d,dif;
    
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    d = sc.nextInt();
        
    dif = (a*b-c*d);
    System.out.println("DIFERENCA = "+dif);    
 
    }
 
}