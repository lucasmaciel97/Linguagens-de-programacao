#include <stdio.h>
#include <stdlib.h>

int main (){
	int a;
		printf("Digite um numero inteiro: \n");
		scanf("%d", &a);
		
	if(a%2==0)
		printf("EH PAR\n");
	else{
		printf("EH IMPAR\n");
	}
	if(a>0)
		printf("EH POSITIVO\n");
	else{
		printf("EH NEGATIVO\n");
	}

}
