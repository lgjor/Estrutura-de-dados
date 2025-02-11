public class MinhaApp{
    public static void main(String args[]){
        Colecao colecao = new Colecao();

        System.out.println("--------------- Busca Sequencial ---------------");
        System.out.println("Posição do elemento 23: "+colecao.buscaSequencial(23));
        System.out.println("Posição do elemento 12: "+colecao.buscaSequencial(12));
        System.out.println("Posição do elemento 76: "+colecao.buscaSequencial(76));
        System.out.println("Posição do elemento 56: "+colecao.buscaSequencial(56));
        System.out.println("\n\n");
        System.out.println("--------------- Busca Binária ---------------");

        System.out.println("Posição do elemento 23: "+colecao.buscaBinaria(23));
        System.out.println("Posição do elemento 12: "+colecao.buscaBinaria(12));
        System.out.println("Posição do elemento 76: "+colecao.buscaBinaria(76));
        System.out.println("Posição do elemento 56: "+colecao.buscaBinaria(56));
    }
}