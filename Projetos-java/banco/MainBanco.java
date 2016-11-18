package Banco;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBanco {
    
    public static void imprime(int saldo){
        System.out.println("O novo saldo eh: " + saldo);
    }
    
    public static void saque(int saldo, int valor){
        if (saldo < 0){
            System.out.println("O saldo esta NEGATIVO!");
                    }
        else{
            saldo -= valor;
        }
    }
    
    public static void deposito(int saldo, int valor){
        if (saldo < 0){
            System.out.println("O saldo esta NEGATIVO!");
                    }
        else{
            saldo += valor;
        }
    }
    
    public static void main(String[] args, int saldo) {
        Scanner teclado = new Scanner(System.in);
        
        ArrayList<Cliente> clnt2 = lerClientes("C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\clientes.txt");
		for(int i = 0; i < clnt2.size(); i++){
			System.out.println(clnt2.get(i));
                }
        ArrayList<Conta> cnt2 = lerContas("C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\contas.txt");
		for(int i = 0; i < cnt2.size(); i++){
			System.out.println(cnt2.get(i));  
                }
    
    System.out.println("Cadastre-se e vire nosso cliente!!");
    
    clnt2.add(new Cliente(777777, "Jose", 263547890, 55555555, "Positivo"));
    salvarClientes(clnt2, "C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\clientes.txt");
                
    System.out.println("Agora cadastre sua Conta");
    
    cnt2.add(new Conta(4444, 873490123, 600, "Negativo", 999));
    salvarContas(cnt2, "C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\contas.txt");
                
    
    System.out.println("O que deseja fazer?");
    System.out.printf("\n1- Sacar.\n 2- Depositar\n");
    String escolha = teclado.nextLine();
    
    if (escolha == "Sacar"){
        System.out.printf("Quanto deseja sacar?");
        int valor = teclado.nextInt();
        saque(saldo, valor);
        imprime(saldo);
    }
    
    System.out.println("O que deseja fazer?");
    System.out.printf("\n1- Sacar.\n 2- Depositar\n");
    String escolha2 = teclado.nextLine();
    
    if (escolha2 == "Depositar"){
        System.out.printf("Quanto deseja depositar?");
        int valor = teclado.nextInt();
        deposito(saldo, valor);
        imprime(saldo);
    }
    
    salvarClientes(clnt2, "C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\clientes.txt");
    salvarContas(cnt2, "C:\\Users\\Lucas\\Documents\\NetBeansProjects\\Banco\\src\\Banco\\contas.txt");

    }

    private static ArrayList<Cliente> lerClientes(String cUsersLucasDocumentsNetBeansProjectsBanco) {
        ArrayList<Cliente> clnt = new ArrayList<Cliente>();
        Scanner sc;
		try {
			
			FileReader fr = new FileReader(cUsersLucasDocumentsNetBeansProjectsBanco);
			sc = new Scanner(fr);
			sc.useDelimiter(";");
			
			while (sc.hasNext()) 
			{	
				int codigo = sc.nextInt();
				System.out.println(codigo);
				
				String nome = sc.next();
				System.out.println(nome);
                                
                                int cpf = sc.nextInt();
				System.out.println(cpf);
                                
                                String endereco = sc.next();
				System.out.println(endereco);
                                
                                int telefone = sc.nextInt();
				System.out.println(telefone);
                                
                                String situacao = sc.next();
				System.out.println(situacao);
				
				Cliente c = new Cliente(codigo, nome, cpf, endereco, telefone, situacao);
				
				clnt.add(c);
				
				sc.nextLine();
			}
			
		} catch (FileNotFoundException e) {
                    e.printStackTrace();
		}
		
		return clnt;
	}

    private static void salvarClientes(ArrayList<Cliente> clnt2, String cUsersLucasDocumentsNetBeansProjectsBanco) {
        PrintWriter pw;
		try{
                    pw = new PrintWriter(cUsersLucasDocumentsNetBeansProjectsBanco);
		
			for(int i = 0; i < clnt2.size(); i++){
                            Cliente a = clnt2.get(i);
                            String sa = a.getCodigo() + ";" + a.getNome() + ";" + a.getCpf() + ";" + a.getEndereco() + ";" + a.getTelefone() + ";" + a.getSituacao() + ";";
				pw.println(sa);
                        }
                        pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
                        }
    }
    
    private static ArrayList<Conta> lerContas(String cUsersLucasDocumentsNetBeansProjectsBanco) {
        ArrayList<Conta> cnt = new ArrayList<Conta>();
        Scanner sc;
		try {
			
			FileReader fr = new FileReader(cUsersLucasDocumentsNetBeansProjectsBanco);
			sc = new Scanner(fr);
			sc.useDelimiter(";");
			
			while (sc.hasNext()) 
			{	
				int agencia = sc.nextInt();
				System.out.println(agencia);
				
				int conta = sc.nextInt();
				System.out.println(conta);
                                
                                int saldo = sc.nextInt();
				System.out.println(saldo);
                                
                                String situacao = sc.next();
				System.out.println(situacao);
                                
                                int codCliente = sc.nextInt();
				System.out.println(codCliente);
                                
				
				Conta c = new Conta(agencia, conta, saldo, situacao, codCliente);
				
				cnt.add(c);
				
				sc.nextLine();
			}
			
		} catch (FileNotFoundException e) {
                    e.printStackTrace();
		}
		
		return cnt;
    }
    
    private static void salvarContas(ArrayList<Conta> cnt2, String cUsersLucasDocumentsNetBeansProjectsBanco) {
        PrintWriter pw;
		try{
                    pw = new PrintWriter(cUsersLucasDocumentsNetBeansProjectsBanco);
		
			for(int i = 0; i < cnt2.size(); i++){
                            Conta c = cnt2.get(i);
                            String sc = c.getAgencia() + ";" + c.getConta() + ";" + c.getSaldo() + ";" + c.getSituacao() + ";" + c.getCodcliente() + ";";
				pw.println(sc);
                        }
                        pw.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
                        }
    }

}