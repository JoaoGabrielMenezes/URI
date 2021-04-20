import java.io.IOException;
import java.util.Scanner;
/*
Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAb=(a+b+abs(a-b))/2

Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	int a,b,c,maior;
    	Scanner sc = new Scanner(System.in);
    	a = sc.nextInt();
    	b = sc.nextInt();
    	c = sc.nextInt();
    	if(a > b && a > c) {
        	System.out.println(a+" eh o maior");
    	}else if(b > c) {
    		System.out.println(b+" eh o maior");
    	}else {
    		System.out.println(c+" eh o maior");
    	}
    	


    	
    }
 
}