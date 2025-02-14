public class AlgoritmosDeOrdenacao{
    private int vetor[]= {25, 57, 48, 37, 12, 92, 33};

    public void setVetor(int vetor[]){
        this.vetor = vetor;
    }

    public int[] getVetor(){
        return vetor;
    }
    
    public void bubbleSort(){
        int it; // numero de iterações
        int pos; // sempre uso a posição atual
        int temp; // variável para a troca

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

    public int partition(int inicio, int fim){
        int ref, up, down, temp;
        ref = vetor[inicio];
        down = inicio;
        up = fim;
        
        while (down < up) {
            // encontrando um número maior que o pivô (ref)
            while (vetor[down]<=ref && down < fim){
                down++;  // Acanço porque quero encontrar um valor maior
            }
            // também quero encontrar a partir do fim um valor menor do que o meu de referência
            while (vetor[up] > ref){
                up--;
            }

            if (down < up){ // Eles não se cruzaram nos índices
                //troca
                temp = vetor[down];
                vetor[down] = vetor[up];
                vetor[up]= temp;
            } 
        }
        vetor[inicio] = vetor[up];
        vetor[up]=ref;
        return up; // no final das contas é a posição de up que denota onde está o pivô
    }

    public void quickSort(int inicio, int fim) {
        int pivo;
        if ( inicio > fim ){ // Se o vetor só tem um elemento, ele já está ordenado
            return;
        }
        pivo = partition(inicio, fim); // Determino o pivo pelo método partition
        quickSort(inicio, pivo-1); // Aplico o quick sort para os elementos anteriores ao pivô
        quickSort(pivo+1, fim); // Aplico o quick sort para os elementos posteriores ao pivô
    }
    
    public void mostraVetor(){
        for (int i=0; i<vetor.length; i++){
            System.out.print(vetor[i]+ " ");
        }
        System.out.println("");
    }

}