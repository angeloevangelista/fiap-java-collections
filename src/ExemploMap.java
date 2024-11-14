import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> notas = new HashMap<>();

        notas.put("Anna", 8);
        notas.put("Lucas", 9);
        notas.put("Fernanda", 6);
        notas.put("Anna", 2);

        System.out.println(notas);

        System.out.println(notas.containsKey("Anna"));

//        while, do while, for i, foreach

        for (Map.Entry<String, Integer> nota: notas.entrySet()) {
            System.out.printf("%s: %s\n", nota.getKey(), nota.getValue());
        }
    }
}
