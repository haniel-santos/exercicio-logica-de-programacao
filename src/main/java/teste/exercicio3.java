package teste;

import java.util.Scanner;

public class exercicio3 {
    /*  3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
        caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e imprimir seu valor na tela. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int A = scanner.nextInt();
        System.out.println("Digite outro numero inteiro: ");
        int B = scanner.nextInt();
        int C = A * B;

        if (A == B) {
            System.out.println("Como os numero inteiros foram iguais");
            System.out.println("elas serão somadas");
            System.out.println("resultado: " + (A + B));
            scanner.close();
        } else {
            System.out.println("Como os numero inteiros foram diferente");
            System.out.println("elas serão multiplicadas");
            System.out.println("resultado: " + C);
            scanner.close();
        }

    }
}
