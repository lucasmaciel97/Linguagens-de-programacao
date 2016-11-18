#include <stdio.h>
#include <stdlib.h>

int main (){
	float x, desc;
	int a;
	
		printf("Qual o valor da venda? \n");
		scanf("%f", &x);
	
		printf("Escolha uma opcao de compra: \n 1-Venda a Vista.\n 2-Venda a Prazo 30 dias.\n 3-Venda a Prazo 60 dias.\n 4-Venda a Prazo com 90 dias.\n 5-Venda com cartão de débito.\n 6-Venda com cartão de crédito.\n\n");
		scanf("%d", &a);
	
	switch(a){
		case 1:
			desc= (x-(x*1/10));
			printf("O VALOR FICA: %f", desc);
			break;
		case 2:
			desc= (x-(x*5/100));
			printf("O VALOR FICA: %f", desc);
			break;
		case 3:
			printf("O VALOR FICA: %f", desc);
			break;
		case 4:
			desc= (x+(x*5/100));
			printf("O VALOR FICA: %f", desc);
			break;
		case 5:
			desc= (x-(x*8/100));
			printf("O VALOR FICA: %f", desc);
			break;
		case 6:
			desc= (x-(x*7/100));
			printf("O VALOR FICA: %f", desc);
		default:
			printf("NUMERO INVALIDO\n");
	}
	
}
