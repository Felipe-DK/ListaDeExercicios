package exercicios;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.forLanguageTag("pt-BR"));

        float salarioAtual = 0;
        float salarioMinimo = 0;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.println("Qual o valor do salário mínimo? (Exemplo: 1293,20)");
                salarioMinimo = scanner.nextFloat();
                System.out.println("Qual o seu salário atual? (Exemplo: 2500,75)");
                salarioAtual = scanner.nextFloat();
                entradaValida = true; 

                float salarioMinimoRecebido = salarioAtual / salarioMinimo;

                System.out.printf("Você recebe aproximadamente %.2f salários mínimos.%n", salarioMinimoRecebido);
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número com vírgula (Exemplo: 1500,50).");
                scanner.next(); 
            }
        }
        scanner.close();
    }
}