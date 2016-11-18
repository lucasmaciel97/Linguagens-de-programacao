#include <stdio.h> 
#include "banco.h" 

void inicializa(Banco *b, int numero, double saldo) {
	b->numero = numero;  
	b->saldo = saldo; 
}

void deposito (Banco *b, double valor) {
	(*b).saldo += valor; 
}

void saque (Banco *b, double valor) {
	(*b).saldo -= valor; 
} 

void imprime (Banco *b) { 
	printf("Numero: %d\n", b.numero);
	printf("Saldo: %f\n", b.saldo);
}
