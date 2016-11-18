import java.util.Scanner;
public class MainProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        Produto p2 = new Produto(2284, "Durez", 45.5, 100);
		
    System.out.println(p1);
		
    p2.removerEstoque(10);
    System.out.println(p2);
			
    System.out.printf(" \nCodigo: " + p1.getCodigo() +
                    " Nome: " + p1.getNome() +
                    " Valor: " + p1.getValor() +
                    " Quantidade: " + p1.getQuantidade());
		
    Scanner dados = new Scanner(System.in);
    System.out.println("\nDigite o código do produto:");
    p1.setCodigo(dados.nextInt());
    System.out.println("Digite o nome do produto:");
    p1.setNome(dados.nextLine());
    System.out.println("Digite o valor do produto:");
    p1.setValor(dados.nextFloat());
    System.out.println("Digite a quantidade do produto:");
    p1.setQuantidade(dados.nextInt());
		
    System.out.printf(" \nCodigo: " + p1.getCodigo() +
                    " Nome: " + p1.getNome() +
                    " Valor: " + p1.getValor() +
                    " Quantidade: " + p1.getQuantidade());
    }
    
}