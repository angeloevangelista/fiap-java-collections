import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();

        int maxTarefas = 5;
        //int tarefaAtual = 0;

        System.out.println("============================");
        System.out.printf("CADASTRO DE TAREFAS (max: %s)", maxTarefas);
        System.out.println("============================");

        do {
            System.out.print("Escreva sua tarefa: ");
            String tarefa = scanner.nextLine();

            while (tarefas.contains(tarefa)) {
                System.out.print("Essa tarefa já foi cadastrada! Tente novamente: ");
                tarefa = scanner.nextLine();
            }

            tarefas.add(tarefa);
            //tarefaAtual++;
//        } while (tarefaAtual < maxTarefas);
        } while (tarefas.size() < maxTarefas);

        System.out.println("Tarefas cadastradas: " + tarefas);

        scanner.close();
    }
}
