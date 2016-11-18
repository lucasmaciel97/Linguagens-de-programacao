public class Produto {
    private int codigo;
    private String nome;
    private double valor;
    private int quantidade;
		
    public Produto(){
	this.codigo = 0;
	this.nome = "Indefinido";
	this.valor = 0;
	this.quantidade = 0;
    }
		
    public Produto(int codigo, String nome, double valor, int quantidade){
	this.codigo = codigo;	
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }
		
    public int getCodigo(){
	return this.codigo;
    }
		
    public void setCodigo(int codigo){
	this.codigo = codigo;
    }

    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    public double getValor() {
	return valor;
    }

    public void setValor(float valor) {
	this.valor = valor;
    }

    public int getQuantidade() {
	return quantidade;
    }

    public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
    }
		
    @Override
    public String toString() {
	return "Produto [Codigo = " + codigo + 
                ", Nome = " + nome + 
                ", Valor = " + valor + 
                ", Quantidade = " + quantidade + "]";
    }
		
    public void removerEstoque(int q){
	this.quantidade -= q;
    }
		
		
}
