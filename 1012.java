import java.io.IOException;
import java.util.Scanner;
/*
Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.
*/
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