import java.io.IOException;
import java.util.Scanner;
/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	int hr,min,seg,seg2;
    	
    	Scanner sc = new Scanner(System.in);
    	seg = sc.nextInt();
    	hr = seg / 3600;
    	seg = seg % 3600;
    	min = seg / 60;
    	seg = seg % 60;
    	seg2 = seg;
    	System.out.println(hr+":"+min+":"+seg);
    }
    
 
}