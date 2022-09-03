package polimorfismo.peixe;

import polimorfismo.Animal;

public class Peixe extends Animal {

    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    // Sopreposição da classe Animal
    @Override
    public void locomover() {
        System.out.println("Nadando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som!");
    }

    // Métodos públicos
    public void soltarBolha() {
        System.out.println("Soltando bolha!");
    }

}
