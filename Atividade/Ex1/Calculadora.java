package Atividade.Ex1;

public class Calculadora {

    public static double adicionar(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtrair(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplicar(double num1, double num2) {
        return num1 * num2;
    }

    
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }

    public static void main(String[] args) {

        double resultadoSoma = Calculadora.adicionar(5, 3);
        System.out.println("5 + 3 = " + resultadoSoma);

        double resultadoSubtracao = Calculadora.subtrair(10, 4);
        System.out.println("10 - 4 = " + resultadoSubtracao);

        double resultadoMultiplicacao = Calculadora.multiplicar(2.5, 4);
        System.out.println("2.5 * 4 = " + resultadoMultiplicacao);

        double resultadoDivisao = Calculadora.dividir(8, 2);
        System.out.println("8 / 2 = " + resultadoDivisao);

        double resultadoDivisaoPorZero = Calculadora.dividir(10, 0); 
        System.out.println("10 / 0 = " + resultadoDivisaoPorZero); 
    }
}

