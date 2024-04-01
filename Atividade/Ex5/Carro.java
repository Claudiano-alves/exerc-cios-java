package Atividade.Ex5;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private int velocidadeAtual;

    public Carro(String marca, String modelo, int ano, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.velocidadeAtual = 0;
    }

    public void acelerar(int aumentoVelocidade) {
        if (aumentoVelocidade > 0) {
            this.velocidadeAtual += aumentoVelocidade;
            System.out.println("O carro acelerou para " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível acelerar com um aumento de velocidade menor ou igual a zero.");
        }
    }

    public void frear(int reducaoVelocidade) {
        if (reducaoVelocidade > 0 && reducaoVelocidade <= this.velocidadeAtual) {
            this.velocidadeAtual -= reducaoVelocidade;
            System.out.println("O carro reduziu a velocidade para " + this.velocidadeAtual + " km/h");
        } else {
            System.out.println("Não é possível frear com uma redução de velocidade inválida.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Placa: " + this.placa);
        System.out.println("Velocidade Atual: " + this.velocidadeAtual + " km/h");
    }

    public int getVelocidadeAtual() {
        return this.velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
}
