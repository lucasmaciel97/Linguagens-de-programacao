package Banco;

public class Cliente {
        private int codigo;
	private String nome;
	private int cpf;
	private String endereco;
	private int telefone;
	private String situacao;
	
	public Cliente(int codigo, String nome, int cpf, String endereco, int telefone, String situacao){
		super();
		this.codigo=codigo;
		this.nome=nome;
		this.cpf=cpf;
		this.endereco=endereco;
		this.telefone=telefone;
		this.situacao=situacao;
	}

    Cliente(int i, String jose, int i0, int i1, String positivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", endereco=" + endereco + ", telefone=" + telefone + ", situacao=" + situacao + "]";
	}
}
