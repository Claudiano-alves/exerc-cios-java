package Atividade.Ex2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    String titulo;
    String autor;
    int anoPublic;

    public Livro(String titulo, String autor, int anoPublic) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublic = anoPublic;
    }

    static void exibirInfo(List<Livro> biblioteca) {
        System.out.println("Biblioteca de livros: ");
        if (biblioteca.size() == 0) {
            System.out.print("Biblioteca vazia!");
        } else {
            for (Livro Livro : biblioteca) {
                System.out.println("-------------------");
                System.out.println("Título: " + Livro.titulo);
                System.out.println("Autor: " + Livro.autor);
                System.out.println("Ano de publicação: " + Livro.anoPublic);
            }
        }
    }

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        List<Livro> biblioteca = new ArrayList<Livro>();

        System.out.print("Digite quantos livros deseja inserir na sua biblioteca: ");
        int quantLivros = Integer.parseInt(leitor.nextLine());

        for (int i = 0; i < quantLivros; i++) {
            System.out.println("Insira o " + (i + 1) + "º livro: ");
            System.out.print("-- Insira o título do livro: ");
            String titulo = leitor.nextLine();
            System.out.print("-- Insira o autor do livro: ");
            String autor = leitor.nextLine();
            System.out.print("-- Insira o ano de publicação do livro: ");
            int anoPublic = Integer.parseInt(leitor.nextLine());

            Livro novoLivro = new Livro(titulo, autor, anoPublic);
            biblioteca.add(novoLivro);
        }

        exibirInfo(biblioteca);
        leitor.close();
    }
}
