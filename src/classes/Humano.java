package classes;

import interfaces.ISeresCumprimentantes;

public abstract class Humano implements ISeresCumprimentantes {
    public String nome;

    public Humano(String nome) {
        this.nome = nome;
    }

    public void cumprimentar() {
        System.out.printf("%s cumprimentou você\n", this.nome);
    }
}
