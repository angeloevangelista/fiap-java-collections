package classes;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorInventario {
    // vamos usar um map pra guardar os produtos (chave) e a quantidade (valor)
    private Map<String, Integer> inventario;

    public GerenciadorInventario() {
        // vamos usar um construtor por 2 motivos:
        // 1. precisamos escolher qual implementacao de Map usar, HashMap vai servir
        // 2. nao vamos nos esquecer que "inventario" é um objeto, começará com NULL
        this.inventario = new HashMap<>();
    }

    public void excluirProduto(String produto) {
        if (!this.inventario.containsKey(produto)) {
            System.out.println("Alto lá! Esse produto nem tá no inventário!");
            return;
        }

        this.inventario.remove(produto);
    }

    public void atualizarQuantidade(String produto, int quantidade) {
        if (quantidade < 0) {
            System.out.println("Você sabe que não pode colocar uma quantidade negativa, não trabalhamos com anti-matéria aqui!");
            return;
        }

        // nao precisamos checar a chave, o 'put' adiciona e atualiza ao mesmo tempo :)
        this.inventario.put(produto, quantidade);
    }

    public void exibirInventario() {
        System.out.println("Inventário:");

        // o entrySet retorna pra gente um 'Set' (lembra dele?) de uma classe
        // chamada 'Map.Entry'. Essa classe tem a Key e o Value pra cada 'item'
        // do nosso 'Map' ;)
        for (Map.Entry<String, Integer> entry: this.inventario.entrySet()){
            System.out.printf(" - %s: %s\n", entry.getKey(), entry.getValue());
        }
    }

    public int checarDisponibilidade(String produto) {
        if (this.inventario.containsKey(produto)) {
            return this.inventario.get(produto);
        }

        return 0;

        // outra forma legal seria a gente usar isso aqui:
        //
        // return this.inventario.getOrDefault(produto, 0);
        //
        // Experimenta pra voce ver. 'getOrDefault' acessa o valor da chave,
        // mas se não encontrá-la, então retorna o valor que você especificar
    }
}
