public class Conversor{
    public static void main(String[] args){
        int numero = Integer.parseInt(args[0]);
        Pilha p = new Pilha();

        int resto;
        
        // fase 1 - empilhamento dos restos
        while(numero != 0){
            resto = numero % 2; // pego o resto da divisão deste número por 2 (vale 0 ou 1)
            p.push(resto);      // armazeno na pilha
            numero = numero / 2;// gero um novo número, resultado da divisão dele por 2
        }

        // fase 2 - exibição dos restos na ordem correta
        while(!p.isEmpty()){
            resto = p.pop(); // desempilho
            System.out.print(resto);
        }
    System.out.print("Fim do programa");
    }
}

// 172 na base 10 é igual a 10101100 na base 2