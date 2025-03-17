package exercicios;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // leitura de variaveis
        System.out.println("Insira o valor A");
        Long valorA = scanner.nextLong();
        System.out.println("Insira o valor B");
        Long valorB = scanner.nextLong();
        System.out.println("Insira o valor C");
        Long valorC = scanner.nextLong();

        // resultado da soma
        Long soma = valorA + valorB;
        System.out.println("A soma dos valores " + valorA + " e " + valorB + " é: " + soma);

        // operador ternario que faz a varificacao
        System.out.println((soma < valorC) ? "Resulado menor que C" : "Resultado maior que C");

        scanner.close();
    }
}
