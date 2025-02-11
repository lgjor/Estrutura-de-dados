public class MyApp{
    public static void main(String[] args){
        System.out.println("\n");
        System.out.println("Olá, seja bem vindo e bem vinda ao MyApp!");
        ListaDuplaCircular lista = new ListaDuplaCircular();
        lista.inserir(87);
        lista.inserir(23);
        lista.inserir(71);
        lista.inserir(38);
        lista.inserir(976);

        lista.exibirNaOrdem();
        System.out.println("-------------------");
        lista.exibirNaOrdemInversa();
    }
}