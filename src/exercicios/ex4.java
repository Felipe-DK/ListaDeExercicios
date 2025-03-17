package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Insira um numero inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;

                int numeroAntecessor = numero - 1;
                int numeroSucessor = numero + 1;

                System.out.println("Antes de " + numero + " temos " + numeroAntecessor + ".");
                System.out.println("Depois de " + numero + " temos " + numeroSucessor + ".");
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}
