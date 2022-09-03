package polimorfismo.ave;

import polimorfismo.Animal;

public class Ave extends Animal {

    private String corPena;

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    // Sopreposição da classe Animal
    @Override
    public void locomover() {
        System.out.println("Voando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave!");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho!");
    }

}
