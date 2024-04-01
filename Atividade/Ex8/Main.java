package Atividade.Ex8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Pizza> pizzasDisponiveis = new ArrayList<>();
        pizzasDisponiveis.add(new Pizza("Calabresa", 30.0, List.of("Molho de tomate", "Calabresa", "Queijo")));
        pizzasDisponiveis.add(new Pizza("Marguerita", 35.0, List.of("Molho de tomate", "Manjericão", "Mussarela")));
        pizzasDisponiveis.add(new Pizza("Frango com Catupiry", 35.0, List.of("Molho de tomate", "Frango", "Catupiry", "Queijo")));

        System.out.println("Menu de Pizzas Disponíveis:");
        for (Pizza pizza : pizzasDisponiveis) {
            System.out.println(pizza.getNome() + " - R$ " + pizza.getValor());
        }

        Pizza pizzaEscolhida = pizzasDisponiveis.get(0);
        Pedido pedido = new Pedido(pizzaEscolhida, "Grande", pizzaEscolhida.getValor(), "Rua A, 123");

        System.out.println("\nPedido realizado:");
        System.out.println("Pizza: " + pedido.getPizza().getNome());
        System.out.println("Tamanho: " + pedido.getTamanho());
        System.out.println("Valor: R$" + pedido.getValor());
        System.out.println("Endereço de Entrega: " + pedido.getEnderecoEntrega());
    }
}

