package Atividade.Ex7;

class Produto {
    private String nome;
    private String codigo;
    private int quantidade;
    private double preco;

    public Produto(String nome, String codigo, int quantidade, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularValorTotal() {
        return quantidade * preco;
    }

    public String toString() {
        return "Nome: " + nome + ", Código: " + codigo + ", Quantidade: " + quantidade + ", Preço: " + preco + " Total: " + calcularValorTotal();
    }
}

