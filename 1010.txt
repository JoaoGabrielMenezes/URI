#include <stdio.h>
 
int main() {

		float peca1,numero1,peca2,numero2,total,valor1,valor2;
    	scanf("%f%f%f",&peca1,&numero1,&valor1);
		scanf("%f%f%f",&peca2,&numero2,&valor2);
		total = valor1*numero1+numero2*valor2;
		printf("VALOR A PAGAR: R$ %.2f\n",total);
    return 0;
}