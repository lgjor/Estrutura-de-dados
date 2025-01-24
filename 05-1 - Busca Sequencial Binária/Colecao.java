public class Colecao{
    // private int valores[] = {12, 56, 87, 23, 27, 45, 78, 90, 34, 106};
    private int valores[] = {12, 23, 27, 34, 45, 56, 78, 87, 90, 106};

    public int buscaSequencial(int val){
        int pos;
        for(pos = 0; pos < valores.length; pos++){
            if(val==valores[pos]){
                return pos;
            }
        }
        return -1; // Elemento não encontrado
    }

    public int buscaBinaria(int val){
        int meio, inicio, fim;
        inicio  = 0;
        fim     = valores.length-1;

        while (inicio <= fim){
            meio = (inicio + fim) / 2;

            if (val == valores[meio]){
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
        return -1; // Elemento não encontrado
    }
}