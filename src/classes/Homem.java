package classes;

public class Homem extends Humano {
    private String nome;
    private String numeroReserva;

    public Homem(String nome) {
        super(nome);
    }

    public Homem(String nome, String numeroReserva) {
        super(nome);
        this.numeroReserva = numeroReserva;
    }
}
