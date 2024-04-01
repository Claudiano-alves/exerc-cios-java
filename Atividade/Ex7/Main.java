package Atividade.Ex7;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        
        List<Produto> estoque = new ArrayList<>();

        estoque.add(new Produto("Arroz", "001", 50, 10.0));
        estoque.add(new Produto("Feijão", "002", 30, 8.0));
        estoque.add(new Produto("Macarrão", "003", 40, 5.0));

        System.out.println("Estoque Atual:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }

        Produto produtoAtualizado = estoque.get(0);
        produtoAtualizado.setQuantidade(60);

        estoque.remove(1);

        System.out.println("\nEstoque Atualizado:");
        for (Produto produto : estoque) {
            System.out.println(produto);
        }
    }
}
