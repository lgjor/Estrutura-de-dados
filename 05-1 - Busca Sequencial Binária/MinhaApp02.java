import java.util.Scanner;

// Pede pela entrada do usuário e retorna o número de iterações para encontrar o valor
public class MinhaApp02{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Colecao colecao = new Colecao();
        int valor, pos;
        do{
            System.out.println("Digite um valor a ser pesquisado (ou -1 para sair): ");
            valor = teclado.nextInt();

            if (valor != -1){
                
                System.out.println("Busca sequencial ");
                pos = colecao.buscaSequencial(valor);
                System.out.println("Busca binária ");
                pos = colecao.buscaBinaria(valor);
            }
        } while (valor != -1);
    }
}