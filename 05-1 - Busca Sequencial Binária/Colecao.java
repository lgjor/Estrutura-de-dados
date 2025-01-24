public class Colecao{
    // private int valores[] = {12, 56, 87, 23, 27, 45, 78, 90, 34, 106};
    private int valores[] = {12, 23, 27, 34, 45, 56, 78, 87, 90, 106};

    public int buscaSequencial(int val){
        int iteracoes = 0;
        int pos;
        for(pos = 0; pos < valores.length; pos++){
            if(val==valores[pos]){
                System.out.println("Iterações: "+iteracoes);
                return pos;
            }
            iteracoes++;
        }
        System.out.println("Iterações: "+iteracoes);
        return -1; // Elemento não encontrado
    }

    public int buscaBinaria(int val){
        int meio, inicio, fim, iteracoes;
        inicio  = 0;
        fim     = valores.length-1; // length - 1 pois o array começa em zero e nesse caso queremos a posição do último elemento e não o número de elementos do array
        iteracoes = 0;

        while (inicio <= fim){
            iteracoes++;
            meio = (inicio + fim) / 2;

            if (val == valores[meio]){
                System.out.println("Iterações: "+iteracoes);
                return meio;
            }
            else {
                if (val > valores[meio]){
                    inicio = meio +1;
                }
                else {
                    fim = meio - 1;
                }
            }
        }
        System.out.println("Iterações: "+iteracoes);
        return -1; // Elemento não encontrado
    }
}