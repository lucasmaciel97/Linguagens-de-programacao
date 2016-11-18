/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contabancaria;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Lucas
 */
public class ClienteConta {
    
        private String codigo;

    public static final String PROP_CODIGO = "codigo";

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        String oldCodigo = this.codigo;
        this.codigo = codigo;
        propertyChangeSupport.firePropertyChange(PROP_CODIGO, oldCodigo, codigo);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private String nome;

    public static final String PROP_NOME = "nome";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

        private int cpf;

    public static final String PROP_CPF = "cpf";

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        int oldCpf = this.cpf;
        this.cpf = cpf;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCpf, cpf);
    }

        private String endereco;

    public static final String PROP_ENDERECO = "endereco";

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        String oldEndereco = this.endereco;
        this.endereco = endereco;
        propertyChangeSupport.firePropertyChange(PROP_ENDERECO, oldEndereco, endereco);
    }

        private int telefone;

    public static final String PROP_TELEFONE = "telefone";

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        int oldTelefone = this.telefone;
        this.telefone = telefone;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONE, oldTelefone, telefone);
    }

        private String situacao;

    public static final String PROP_SITUACAO = "situacao";

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        String oldSituacao = this.situacao;
        this.situacao = situacao;
        propertyChangeSupport.firePropertyChange(PROP_SITUACAO, oldSituacao, situacao);
    }

        private int agencia;

    public static final String PROP_AGENCIA = "agencia";

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        int oldAgencia = this.agencia;
        this.agencia = agencia;
        propertyChangeSupport.firePropertyChange(PROP_AGENCIA, oldAgencia, agencia);
    }

        private int conta;

    public static final String PROP_CONTA = "conta";

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        int oldConta = this.conta;
        this.conta = conta;
        propertyChangeSupport.firePropertyChange(PROP_CONTA, oldConta, conta);
    }

        private int saldo;

    public static final String PROP_SALDO = "saldo";

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        int oldSaldo = this.saldo;
        this.saldo = saldo;
        propertyChangeSupport.firePropertyChange(PROP_SALDO, oldSaldo, saldo);
    }

}
