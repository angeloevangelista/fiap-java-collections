import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<String>();

        nomes.add("Angelo");
        nomes.add("Anna");
        nomes.add("Lucas");
        nomes.add("Bruno");
        nomes.add("Andressa");

        System.out.println(nomes);
        System.out.println(nomes.size());
        System.out.println(nomes.get(2));

        List<String> algunsNomes = nomes.subList(2, 4);

        System.out.println(algunsNomes);

//     </> Lista de tarefas
//
//        - Usuário vai informando as tarefas
//        - Não pode ter tarefa repetida
//        - Vamos adicionar 5 tarefas apenas
    }
}
