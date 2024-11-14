package classes;

import interfaces.ISeresCumprimentantes;

public class Cachorro implements ISeresCumprimentantes {
    public String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    public void cumprimentar() {
        System.out.println("Au au");
    }
}
