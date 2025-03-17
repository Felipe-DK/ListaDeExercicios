package exercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Digite um numero inteiro: ");
                numero = scanner.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next();
            }
        }

        System.out.println((numero % 2 == 0 ? numero + " é PAR" : numero + " é IMPAR"));


        scanner.close();
    }
}
