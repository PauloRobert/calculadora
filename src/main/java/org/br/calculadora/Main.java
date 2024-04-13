package org.br.calculadora;


public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        // Realizando algumas operações de exemplo
        int resultadoSoma = calculadora.somar(5, 3);
        System.out.println("Resultado da soma: " + resultadoSoma);

        int resultadoSubtracao = calculadora.subtrair(10, 4);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);

        int resultadoMultiplicacao = calculadora.multiplicar(7, 2);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        double resultadoDivisao = calculadora.dividir(15, 3);
        System.out.println("Resultado da divisão: " + resultadoDivisao);
    }
}
