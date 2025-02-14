import java.util.Scanner;

/* 
Como invocar o MainApp

java MainApp [tamanhoDoVetorASerCriado] [qualAlgoritmo] < arquivoComDadosdoVetor > arquivoDeSaida

qualAlgoritmo
1 = Bubble Sort
2 = Selection Sort
3 = Insertion Sort

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
        long inicio = System.currentTimeMillis();
        if (opcao == 1){
            System.out.println("Realizando Bubble Sort em um vetor de "+vetor.length+" elementos");
            alg.bubbleSort();
        }
        else if (opcao == 2){
            System.out.println("Realizando Selection Sort em um vetor de "+vetor.length+" elementos");
            alg.selectionSort();
        }
        else if (opcao == 3){
            System.out.println("Realizando Insertion Sort em um vetor de "+vetor.length+" elementos");
            alg.insertionSort();
        }
        else if (opcao == 4){
            System.out.println("Realizando Quick Sort em um vetor de "+vetor.length+" elementos");
            alg.quickSort(0,alg.getVetor().length-1);
        }
        long fim = System.currentTimeMillis();
        System.out.println("Demorou "+(fim-inicio)+" milisegundos para ordenar");
        // alg.mostraVetor();
    }
}