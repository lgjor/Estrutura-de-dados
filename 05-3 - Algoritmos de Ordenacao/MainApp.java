import java.util.Scanner;

public class MainApp{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[Integer.parseInt(args[0])];

        for  (int i=0; i<vetor.length; i++){
            vetor[i]=teclado.nextInt();
        }

        AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
        alg.setVetor(vetor);
        alg.bubbleSort();
        alg.mostraVetor();
    }
}