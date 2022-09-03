package polimorfismo.reptil;

import polimorfismo.Animal;

public class Reptil extends Animal {

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
        System.out.println("Rastejando!");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil!");
    }

}
