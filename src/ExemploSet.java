import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();

        while (numeros.size() < 10) {
            int valor = (int)(Math.random() * 20);

            numeros.add(valor);
        }

        System.out.println(numeros);

//        Integer, Double, Boolean, Float
//        int, double, boolean, float, String
    }
}
