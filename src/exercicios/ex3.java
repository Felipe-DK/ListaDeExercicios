package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valorA = 0;
        int valorB = 0;
        boolean entradaValida = false;


        while (!entradaValida) {
            try {
                System.out.println("Insira o primeiro número inteiro:");
                valorA = scanner.nextInt();
                System.out.println("Insira o segundo número inteiro:");
                valorB = scanner.nextInt();
                entradaValida = true; 
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }

        if (valorA == valorB) {
            int valorC = valorA + valorB;
            System.out.println("Os valores são iguais. A soma é: " + valorC);
        } else {
            int valorC = valorA * valorB;
            System.out.println("Os valores são diferentes. A multiplicação é: " + valorC);
        }

        scanner.close();
    }
}