import classes.GerenciadorInventario;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExercicioMap {
    public static void main(String[] args) {
        GerenciadorInventario gerenciador = new GerenciadorInventario();

        gerenciador.atualizarQuantidade("mouse", 3);
        gerenciador.atualizarQuantidade("cadeira", 1);

        gerenciador.exibirInventario();

        gerenciador.atualizarQuantidade("mouse", 4);
        gerenciador.excluirProduto("cadeira");

        gerenciador.exibirInventario();

        int cadeirasDisponiveis = gerenciador.checarDisponibilidade("cadeira");

        System.out.printf("Quantidade de cadeiras disponíveis: %s", cadeirasDisponiveis);
    }
}