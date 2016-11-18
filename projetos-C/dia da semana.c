#include <stdio.h>
#include <stdlib.h>

int main (){
	int a;
		printf("Digite um numero de 1 ate 7: \n");
		scanf("%d", &a);
	
	switch(a){
		case 1:
			printf("O DIA EH DOMINGO\n");
			break;
		case 2:
			printf("O DIA EH SEGUNDA\n");
			break;
		case 3:
			printf("O DIA EH TERCA\n");
			break;
		case 4:
			printf("O DIA EH QUARTA\n");
			break;
		case 5:
			printf("O DIA EH QUINTA\n");
			break;
		case 6:
			printf("O DIA EH SEXTA\n");
			break;
		case 7:
			printf("O DIA EH SABADO\n");
			break;
		default:
			printf("NUMERO INVALIDO\n");
	}
	
}
