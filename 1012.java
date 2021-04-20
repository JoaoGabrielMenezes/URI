import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	double a,b,c,tri,circ,trap,quad,ret,pi = 3.14159;
    	
    	Scanner sc = new Scanner(System.in);
    	a = sc.nextDouble();
    	b = sc.nextDouble();
    	c = sc.nextDouble();
    	
    	tri = (a*c)/2;
    	circ = pi*(c*c);
    	trap = ((a+b)*c)/2;
    	quad = b*b;
    	ret = a*b;
    	
    	System.out.printf("TRIANGULO: %.3f\n",tri);
    	System.out.printf("CIRCULO: %.3f\n",circ);
    	System.out.printf("TRAPEZIO: %.3f\n",trap);
    	System.out.printf("QUADRADO: %.3f\n",quad);
    	System.out.printf("RETANGULO: %.3f\n",ret);
    }
 
}