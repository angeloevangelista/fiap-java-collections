import classes.Cachorro;
import classes.Homem;
import classes.Humano;
import interfaces.ISeresCumprimentantes;

public class ExemploInterfaces {
    public static void main(String[] args) {
        ISeresCumprimentantes humano = new Homem("Peter");
        ISeresCumprimentantes cachorro = new Cachorro("Bolinha");

        humano.cumprimentar();
        cachorro.cumprimentar();
    }
}