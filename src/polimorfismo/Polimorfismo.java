package polimorfismo;

import polimorfismo.ave.Arara;
import polimorfismo.ave.Ave;
import polimorfismo.mamifero.Cachorro;
import polimorfismo.mamifero.Canguru;
import polimorfismo.mamifero.Mamifero;
import polimorfismo.peixe.Goldfish;
import polimorfismo.peixe.Peixe;
import polimorfismo.reptil.Cobra;
import polimorfismo.reptil.Reptil;
import polimorfismo.reptil.Tartaruga;

public class Polimorfismo {

    public static void main(String[] args) {
        // Animal animal = new Animal(); (CLASSE ABSTRATA!)

        var ave = new Ave(); // HERDEIRA DA CLASSE ANIMAL
        ave.setPeso(0.89);
        System.out.println("Peso: " + ave.getPeso());

        ave.setIdade(2);
        System.out.println("Idade: " + ave.getIdade());

        ave.setMembros(2);
        System.out.println("Qtd de membros: " + ave.getMembros());

        ave.locomover();        // voando
        ave.alimentar();        // comendo
        ave.emitirSom();        // som de ave
        ave.fazerNinho();       // construiu um ninho

        saltarLinha();

        var arara = new Arara();    // HERDEIRA DA CLASSE AVE, DESCENDENTE DA CLASSE ANIMAL
        arara.setPeso(2.5);
        System.out.println("Peso: " + arara.getPeso());

        arara.setIdade(3);
        System.out.println("Idade: " + arara.getIdade());

        arara.setMembros(2);
        System.out.println("Qtd de membros: " + arara.getMembros());

        arara.setCorPena("Azul e verde");
        System.out.println("Cor da pena: " + arara.getCorPena());

        arara.locomover();      // voando
        arara.alimentar();      // comendo
        arara.emitirSom();      // som de ave
        arara.fazerNinho();     // construiu um ninho

        var mamifero = new Mamifero();  // HERDEIRA DA CLASSE ANIMAL
        mamifero.setPeso(85.3);
        System.out.println("Peso: " + mamifero.getPeso());

        mamifero.setIdade(2);
        System.out.println("Idade: " + mamifero.getIdade());

        mamifero.setMembros(4);
        System.out.println("Qtd de membros: " + mamifero.getMembros());

        mamifero.locomover();   // correndo
        mamifero.alimentar();   // mamando
        mamifero.emitirSom();   // som de mamífero

        saltarLinha();

        var cachorro = new Cachorro();  // HERDEIRA DA CLASSE MAMIFERO, DESCENDENTE DA CLASSE ANIMAL
        cachorro.setPeso(3.94);
        System.out.println("Peso: " + cachorro.getPeso());

        cachorro.setIdade(5);
        System.out.println("Idade: " + cachorro.getIdade());

        cachorro.setMembros(4);
        System.out.println("Qtd de membros: " + cachorro.getMembros());

        cachorro.setCorPelo("Caramelo");
        System.out.println("Cor do pelo: " + cachorro.getCorPelo());

        cachorro.locomover();   // correndo
        cachorro.alimentar();   // mamando
        cachorro.enterrarOsso();    // enterrando osso
        cachorro.abanarRabo();      // abanando rabo
        cachorro.emitirSom();   // latindo

        saltarLinha();

        var canguru = new Canguru();    // HERDEIRA DA CLASSE MAMIFERO, DESCENDENTE DA CLASSE ANIMAL
        canguru.setPeso(55.30);
        System.out.println("Peso: " + canguru.getPeso());

        canguru.setIdade(3);
        System.out.println("Idade: " + canguru.getIdade());

        canguru.setMembros(4);
        System.out.println("Qtd de membros: " + canguru.getMembros());

        canguru.setCorPelo("Caramelo");
        System.out.println("Cor do pelo: " + canguru.getCorPelo());

        canguru.locomover();    // saltando
        canguru.alimentar();    // mamando
        canguru.emitirSom();    // som de mamífero
        canguru.usarBolsa();    // usando bolsa

        saltarLinha();

        var peixe = new Peixe();    // HERDEIRA DA CLASSE ANIMAL
        peixe.setPeso(0.35);
        System.out.println("Peso: " + peixe.getPeso());

        peixe.setIdade(1);
        System.out.println("Idade: " + peixe.getIdade());

        peixe.setMembros(0);
        System.out.println("Qtd de membros: " + peixe.getMembros());

        peixe.locomover();     // nadando
        peixe.alimentar();     // peixe não faz som!
        peixe.emitirSom();     // soltando bolha

        saltarLinha();

        var goldfish = new Goldfish();  // HERDEIRA DA CLASSE PEIXE, DESCENDENTE DA CLASSE ANIMAL
        goldfish.setPeso(1.2);
        System.out.println("Peso: " + goldfish.getPeso());

        goldfish.setIdade(1);
        System.out.println("Idade: " + goldfish.getIdade());

        goldfish.setMembros(0);
        System.out.println("Qtd de membros: " + goldfish.getMembros());

        goldfish.setCorEscama("Dourado");
        System.out.println("Cor da escama: " + goldfish.getCorEscama());

        goldfish.locomover();     // nadando
        goldfish.alimentar();     // peixe não faz som!
        goldfish.emitirSom();     // soltando bolha

        saltarLinha();

        var reptil = new Reptil();  // HERDEIRA DA CLASSE ANIMAL
        reptil.setPeso(0.56);
        System.out.println("Peso: " + reptil.getPeso());

        reptil.setIdade(1);
        System.out.println("Idade: " + reptil.getIdade());

        reptil.setMembros(0);
        System.out.println("Qtd de membros: " + reptil.getMembros());

        reptil.locomover();     // ratejando
        reptil.alimentar();     // comendo
        reptil.emitirSom();     // som de reptil

        saltarLinha();

        var cobra = new Cobra();    // HERDEIRA DA CLASSE REPTIL, DESCENDENTE DA CLASSE ANIMAL
        cobra.setPeso(2.0);
        System.out.println("Peso: " + cobra.getPeso());

        cobra.setIdade(4);
        System.out.println("Idade: " + cobra.getIdade());

        cobra.setMembros(0);
        System.out.println("Qtd de membros: " + cobra.getMembros());

        cobra.setCorEscama("Camuflada");
        System.out.println("Cor da escama: " + cobra.getCorEscama());

        cobra.locomover();      // ratejando
        cobra.alimentar();      // comendo
        cobra.emitirSom();      // som de reptil

        saltarLinha();

        var tartaruga = new Tartaruga();    // HERDEIRA DA CLASSE REPTIL, DESCENDENTE DA CLASSE ANIMAL
        tartaruga.setPeso(10.1);
        System.out.println("Peso: " + tartaruga.getPeso());

        tartaruga.setIdade(99);
        System.out.println("Idade: " + tartaruga.getIdade());

        tartaruga.setMembros(4);
        System.out.println("Qtd de membros: " + tartaruga.getMembros());

        tartaruga.locomover();  // andando beeeem devagar
        tartaruga.alimentar();  // comendo
        tartaruga.emitirSom();  // som de reptil
    }

    public static void saltarLinha() {
        System.out.println();
    }

}
