#include <stdio.h>
#include <stdlib.h>

int main (){
	int a, b;
		printf("Digite um numero inteiro: \n");
		scanf("%d", &a);
		printf("Digite outro numero inteiro: \n");
		scanf("%d", &b);
		
	if (a==b)
		printf("SAO IGUAIS\n");
	else{
		printf("SAO DIFERENTES\n");
	}
	if(a<b)
		printf("O MENOR EH %d\n", a);
	if(a>b)
		printf("O MAIOR EH %d\n", a);

}
