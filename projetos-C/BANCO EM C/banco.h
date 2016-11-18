struct banco{
   int numero;
   double saldo;
};

typedef struct banco Banco;

void inicializa(Banco *b, int numero, double saldo);
void deposito (Banco *b, double valor);
void saque (Banco *b, double valor); 
void imprime (Banco *b);
