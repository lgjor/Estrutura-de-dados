public class Televisao {
    String marca;
    boolean ligada;
    int volume;
    int canal;

    public Televisao(){
        ligada = false;
    }

    public void ligar(){
        ligada = true;
        System.out.println("TV "+marca+" Ligada");
    }

    public void desligar(){
        System.out.println("Desligando TV "+marca);
        ligada = false;        
    }

    public void defineMarca(String NomeDaMarca){
        marca = NomeDaMarca;
        System.out.println("TV - Marca Definida: "+marca);
    }

    public void defineVolume(int vol){
        if (ligada) {
            volume = vol;
            System.out.println("TV "+marca+" Volume Definido para "+volume);
        }
        else {
            System.out.println("Por favor, ligue antes a TV "+marca);
        }
    }

    public void defineCanal(int canal){
        if (ligada) {
            canal = 1;
            System.out.println("TV "+marca+" Com canal definido para "+canal);
        }
        else {
            System.out.println("Por favor, ligue antes a TV "+marca);
        }
    }

    public void aumentaVolume(){
        if (ligada) {
            volume++;
            System.out.println("TV "+marca+" Volume aumentado para "+volume);
        }
        else {
            System.out.println("Por favor, ligue antes a TV "+marca);
        }
    }
}
