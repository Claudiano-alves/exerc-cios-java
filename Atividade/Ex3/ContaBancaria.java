package Atividade.Ex3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    int numeroConta;
    String nomeTitular;
    int saldo;

    ContaBancaria(int numeroConta, String nomeTitular, int saldo) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }
    
    
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
    
    public static void depositar(List<ContaBancaria> banco) {
        Scanner leitor = new Scanner(System.in);
        for(ContaBancaria contBancaria : banco){
            int numConta = lerInt(leitor, "Digite o número da conta: ");
            if(numConta == contBancaria.numeroConta){
                int valorDeposito = lerInt(leitor, "Digite o valor de depósito: ");
                contBancaria.saldo += valorDeposito;
                System.out.println("Deposito realizado com sucesso!\n");
                break;
            }else{System.out.println("Número de conta inválido!");}
        }
    }

    public static void sacar(List<ContaBancaria> banco) {
        Scanner leitor = new Scanner(System.in);
        boolean contaEncontrada = false;
        for(ContaBancaria contBancaria : banco){
            int numConta = lerInt(leitor, "Digite o número da conta: ");
            if(numConta == contBancaria.numeroConta){
                contaEncontrada = true;
                int valorSaque = lerInt(leitor, "Digite o valor de saque: ");
                if(valorSaque > contBancaria.saldo){
                    System.out.println("Saldo insuficinete!");
                } else{
                    contBancaria.saldo -= valorSaque;
                    System.out.println("Saque realizado com sucesso!\n");
                    break;
                }
            }if(!contaEncontrada){System.out.println("Número de conta inválido!");}
        }
    }
    
    public static void saldo(List<ContaBancaria> banco) {
        Scanner leitor = new Scanner(System.in);
        for(ContaBancaria contBancaria : banco){
            String nomTitular = lerString(leitor, "Digite o nome do titular da conta: ");
            int numConta = lerInt(leitor, "Digite o número da conta: ");
            
            if(numConta == contBancaria.numeroConta){
                System.out.println("Saldo de: " + nomTitular + " é de: R$" + contBancaria.saldo + ",00");
                break;
            } else {
                System.out.println("Número de conta inválido!");
            }
        }
    }

    public static void main(String[] args) {
        List<ContaBancaria> banco = new ArrayList<ContaBancaria>();

        Scanner leitor = new Scanner(System.in);
        int option = 0;
        do{
            System.out.println("## Bem vindo ao Banco Panguou!");
            System.out.println("--Escolha uma das opções a baixo:");
            System.out.println("1 - Criar nova conta;");
            System.out.println("2 - Consultar contas criadas;");
            System.out.println("3 - Sacar;");
            System.out.println("4 - Depositar;");
            System.out.println("5 - Consultar Saldo;");
            System.out.println("0 - Sair;");
            option = Integer.parseInt(leitor.nextLine());

            switch (option) {
                case 1:
                    System.out.print("Insira a quantidade de contas que deseja criar: ");
                    int quantContas = Integer.parseInt(leitor.nextLine());
            
                    for (int i = 0; i < quantContas; i++) {
                        String nomeTitular = lerString(leitor, "Digite o nome do titular: ");
                        int numeroConta = lerInt(leitor, "Digite um numero de conta: ");
                        int saldo = lerInt(leitor, "Deposite um valor: ");
                        String buffer = leitor.nextLine();         
                        ContaBancaria novaContaBancaria = new ContaBancaria(numeroConta, nomeTitular, saldo);
                        banco.add(novaContaBancaria);
                    }
                    break;
                case 2:
                    if(banco.isEmpty()){System.out.println("Nenhuma conta registrada");} 
                    else{
                        for(ContaBancaria contBancaria : banco){
                            System.out.println("Nome do titular: " + contBancaria.nomeTitular);
                            System.out.println("Conta do titular: " + contBancaria.numeroConta);
                            System.out.println("Saldo: " + contBancaria.saldo);
                            System.out.println("<<---------------------------->> ");
                        }   
                    }
                    break;
                case 3:
                    sacar(banco);
                    break;
                case 4:    
                    depositar(banco);
                    break;
                case 5:
                    saldo(banco);
                    break;
                case 0:
                    System.out.println("Encerrando...\nAté logo!");
                    break;
                default:
                    System.out.println("<<------------------->>");
                    System.out.println("Panguão, digite um valor válido!");
                    System.out.println("<<------------------->>");
                    break;
            }
        } while(option != 0);
        leitor.close();

    }
}
