package Banco;

public class Conta {
        private int agencia;
	private int conta;
	private int saldo;
	private String situacao;
	private int codcliente;
	
	public Conta(int agencia, int conta, int saldo, String situacao, int codcliente){
		super();
		this.agencia=agencia;
		this.conta=conta;
		this.saldo=saldo;
		this.situacao=situacao;
		this.codcliente=codcliente;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia= agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public int getCodcliente() {
		return codcliente;
	}
	public void setCodcliente(int codcliente) {
		this.codcliente = codcliente;
	}
	
	@Override
	public String toString() {
		return "Conta [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", situacao=" + situacao + ", codcliente=" + codcliente + "]";
	}
}