import java.util.Scanner;

/* 
Como invocar o MainApp

java MainApp [tamanhoDoVetorASerCriado] [qualAlgoritmo] < arquivoComDadosdoVetor > arquivoDeSaida

qualAlgoritmo
1 = Bubble Sort
2 = Selection Sort

 */
public class MainApp{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[Integer.parseInt(args[0])];
        int opcao = Integer.parseInt(args[1]);

        for  (int i=0; i<vetor.length; i++){
            vetor[i]=teclado.nextInt();
        }

        AlgoritmosDeOrdenacao alg = new AlgoritmosDeOrdenacao();
        alg.setVetor(vetor);
        if (opcao == 1){
            alg.bubbleSort();
        }
        else if (opcao == 2){
            alg.selectionSort();
        }
        alg.mostraVetor();
    }
}