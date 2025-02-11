public class AlgoritmosDeOrdenacao{
    private int vetor[]= {25, 57, 48, 37, 12, 92, 33};

    public void setVetor(int vetor[]){
        this.vetor = vetor;
    }
    
    public void bubbleSort(){
        int it; // numero de iterações
        int pos; // sempre uso a posição atual
        int temp; // variável para a troca

        System.out.println("Realizando BubbleSort em um vetor de "+vetor.length+" elementos");

        for (it=0; it < vetor.length; it++){
            for (pos = 0; pos < vetor.length -it -1; pos++){
                // comparo o elemento da posição com o seu próximo
                if (vetor[pos] > vetor[pos+1]){ // o elemento atual é maior que seu próximo?
                    temp            = vetor[pos];
                    vetor[pos]      = vetor[pos+1];
                    vetor[pos+1]    = temp;
                }
            }
            //System.out.println("-- -> Final da iteração "+it);
            //mostraVetor();

        }

    }

    public void selectionSort(){
        int it, temp;
        int posMenorInicial;
        int posMenor;
        int i;

        for (it=0; it<vetor.length-1; it++){
            posMenorInicial= it;
            posMenor = it+1;
            for (i = posMenorInicial+1; i < vetor.length; i++){
                if (vetor[i] < vetor[posMenor]){
                    posMenor = i;
                }
            }
            if (vetor[posMenor] < vetor[posMenorInicial]){
                // troca
                temp = vetor[posMenorInicial];
                vetor[posMenorInicial] = vetor[posMenor];
                vetor[posMenor] = temp;
            }
            /*System.out.println("Iteração "+it);
            mostraVetor();*/
        }
    }

    public void insertionSort(){ 
        int carta, it, j; // a iteracao vai "selecionar a carta da vez" e aí, tenho que "puxar" todos os elementos que são maiores
        for (it = 1; it < vetor.length; it++){
            carta = vetor[it]; // guardo a carta
            for (j = it-1; (j>=0) && vetor[j] > carta; j--){
                vetor[j+1] = vetor[j]; // estou trocando todos que são maiores do que eu
            }
            vetor[j+1] = carta;
            //System.out.println(“—— Iteracao “+ it);
            //mostraVetor();
        }
    }
    
    public void mostraVetor(){
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]+ " ");
        }
        System.out.println("");
    }

}