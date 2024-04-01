package Atividade.Ex4;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Jogador{
    private String nome;
    private int pontuacao;
    private int nivel;
    
    public static String lerString(Scanner scanner, String prompt){
        System.err.println(prompt);
        return scanner.nextLine();
    }

    public static int lerInt(Scanner scanner, String prompt){
        System.out.println(prompt);
        if(!scanner.hasNextInt()){
            System.out.println("Insira um número válido: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    Jogador(String nome, int pontuacao, int nivel){
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }


    public static void setPontuacao(List<Jogador> time){
        Scanner leitor = new Scanner(System.in);
        int option = 0;
        do{
            if (time.isEmpty()) {
                System.out.println("Nenhum jogador inserido ainda.");
                break;
            }
            System.out.println("1 - Alterar;");
            System.out.println("2 - Adicionar;");
            System.out.println("0 - Sair;");
            option = Integer.parseInt(leitor.nextLine());

            switch(option){
                case 1:
                    for(Jogador jogadores : time){
                        String nomeJogador = lerString(leitor, "Insira o nome do jogador que deseja alterar a pontuação: ");
                        if(nomeJogador.equals(jogadores.nome)){
                            int novaPontuacaoJogador = lerInt(leitor, "Insira a nova pontuação de: " + jogadores.nome);
                            jogadores.pontuacao = novaPontuacaoJogador;
                            System.out.println("Pontuação de: " + nomeJogador + " alterada!");
                            String buffer = leitor.nextLine();
                        } else {System.out.println("Jogador não encontrado!");};
                        break;
                    }
                    break;
                case 2:
                    for(Jogador jogadores : time){
                        String adicionarTodos = lerString(leitor, "Adicionar pontuação a todos os jogadores do time?\n Digite: (N) para Não, (S) para Sim: ");
                            if(adicionarTodos.equals("N")){
                                String nomeJogador = lerString(leitor, "Informe o nome do jogador que dejeta adicionar pontuação: ");
                                if(nomeJogador.equals(jogadores.nome)){
                                    int quantPartidas = lerInt(leitor, "Quantas partidas você quer inserir pontuação para esse jogador: ");
                                    for(int i = 0; i < quantPartidas; i++){
                                        int pontPartidas = lerInt(leitor, "Insira a pontuação da " +(i+1)+ "º partida [de 1 a 10]: ");
                                        String buffer = leitor.nextLine();
                                        if(pontPartidas <= 0 && pontPartidas > 10){
                                            System.out.println("Você inseriu uma pontuação inválida!");
                                        }
                                        else {
                                            jogadores.pontuacao += pontPartidas;
                                            jogadores.pontuacao /= quantPartidas;
                                        }
                                    }        
                                }
                            }
                            if(adicionarTodos.equals("S")){
                                int quantPartidas = lerInt(leitor, "Quantas partidas você quer inserir pontuação para esse jogador: ");
                                for(int i = 0; i < quantPartidas; i++){
                                    for(Jogador jogador : time){
                                        int pontPartidas = lerInt(leitor, "Insira uma pontuação entre [de 1 a 10] de: " + jogador.nome);
                                        String buffer = leitor.nextLine();
                                        if(pontPartidas <= 0 && pontPartidas > 10){
                                            System.out.print("Você inseriu uma pontuação inválida!");
                                        }
                                        else {
                                            jogador.pontuacao += pontPartidas;
                                            jogador.pontuacao /= quantPartidas;
                                        }
                                    }
                                }
                            }
                            else {System.out.println("Você digitou uma valor inválido");};
                            break;
                    } 
                    break;
                default:
                    System.out.println("<<------------------->>\nBangu pede um valor válido!\n<<------------------->>");
                    break;
            }
        }while(option != 0);
        
    } 

    public static void setNivel(List<Jogador> time) {
        Scanner leitor = new Scanner(System.in);
        for(Jogador jogadores : time){
            if (time.isEmpty()) {
                System.out.println("Nenhum jogador inserido ainda.");
                break;
            }
            String adicionarTodos = lerString(leitor, "Deseja alterar o nível de todos os jogadores do time?\n Digite: (N) para Não, (S) para Sim: ");
            if(adicionarTodos.equals("N")){
                String nomeJogador = lerString(leitor, "Informe o nome do jogador que dejeta alterar: ");
                if(nomeJogador.equals(jogadores.nome)){
                        int nivel = lerInt(leitor, "Insira o nível [1 a 10] do jogador: " + jogadores.nome);
                        if(nivel <= 0 && nivel > 10){
                            System.out.print("Você inseriu um valor inválida!");
                        }
                        else {
                            jogadores.nivel = 0;
                            jogadores.nivel = nivel;
                        }
                    }        
            }  
            if(adicionarTodos.equals("S")){
                for(Jogador jogador : time){
                    int nivel = lerInt(leitor, "Insira o nível entre [de 1 a 10] de: " + jogador.nome);
                    if(nivel <= 0 && nivel > 10){
                        System.out.print("Você inseriu uma pontuação inválida!");
                    }
                    else {
                        jogador.nivel = 0;
                        jogador.nivel = nivel;
                    }
                }
            }
            else {System.out.print("Você digitou uma valor inválido");};
        }
    }

    public static void main(String[] args) {
        List<Jogador> time = new ArrayList<Jogador>();
        Scanner leitor = new Scanner(System.in);
        int option;
        
        do{
             
            System.out.println("##Bem vindo a quadra de esportes Bangu!");
            System.out.println("<<----------------------------------->>");
            System.out.println("--Escolha uma das opções a baixoo bixooo");
            System.out.println("1 - Resgistrar time;");
            System.out.println("2 - Consultar time resgistrado;");
            System.out.println("3 - Alterar/Adiocionar pontuação dos jogadores em partidas;");
            System.out.println("4 - Alterar nível dos jogadores;");
            System.out.println("0 - Sair;");
            option = Integer.parseInt(leitor.nextLine());
            
            switch(option){
                case 1:
                    System.out.print("Quantos jogadores deverão compôr seu time?\n --Insira aqui: ");
                    int quantJogadores = Integer.parseInt(leitor.nextLine());
                    for(int i = 0; i < quantJogadores; i++){
                        String nomeJogador = lerString(leitor, "Nome do " + (i + 1) + "º jogador:");
                        int pontuacaoJogador = lerInt(leitor, "Adicione aqui a pontuação média de: " + nomeJogador);
                        int nivelJogador = lerInt(leitor, "Adione aqui o nível de: " + nomeJogador);
                        String buffer = leitor.nextLine();
                        Jogador novoJogador = new Jogador(nomeJogador, pontuacaoJogador, nivelJogador);
                        time.add(novoJogador);
                    }
                    break;
                case 2:
                    if(time.isEmpty()){System.out.println("--Nenhum time registrado!\n");} 
                    else{
                        System.out.println("--Info jogadores");
                        for(Jogador jogadores : time){
                            System.out.println("Nome: " + jogadores.nome);
                            System.out.println("Pontuação: " + jogadores.pontuacao);
                            System.out.println("Nível: " + jogadores.nivel);
                            System.out.println("<<---------------------------->> ");
                        }   
                    }
                    break;
                case 3:
                    setPontuacao(time);
                    break;
                case 4:
                    setNivel(time);
                    break;
                case 0:
                    System.out.println("Encerrando...\nAté logo!");
                    break;
                default:
                    System.out.println("<<------------------->>\nBangu pede um valor válido!\n<<------------------->>");
                    break;
            }
            
        }while(option != 0);

        leitor.close();

    }
}