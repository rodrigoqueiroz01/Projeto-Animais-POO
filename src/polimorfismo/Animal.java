package polimorfismo;

public abstract class Animal {

    // Atributos de animal
    protected double peso;
    protected int idade;
    protected int membros;

    // Métodos Abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    // Métodos
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
}
