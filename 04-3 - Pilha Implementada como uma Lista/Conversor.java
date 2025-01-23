public class Conversor{
    public static void main(String[] args){
        int numero = Integer.parseInt(args[0]); // Recebe o número a ser convertido no primeiro argumento do vetor
        int resto;
        IPilha p;

        try{
            // Agora o usuário decide se quer Pilha ou Pilhadinamica
            p = (IPilha) Class.forName(args[1]).newInstance(); // Recebe o tipo de pilha a ser utilizada no segundo argumento do vetor

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
            System.out.print("\nFim do programa");
        }
        catch(Exception ex){
            System.out.println("Deu ruim");
        }
        
  
    }
}
// 172 na base 10 é igual a 10101100 na base 2