package teste;

import java.util.Scanner;

public class exercicio1 {
    //1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B é mostre se a soma é menor que C.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int A = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int B = scanner.nextInt();
        System.out.println("Digite o terceiro número:");
        int C = scanner.nextInt();

        int AB = A + B;

        if(AB > C) {
            System.out.println("A soma entre A e B é maior que C");
        } else if (AB < C) {
            System.out.println("A soma entre A e B é menor que C");
        } else {
            System.out.println("A soma entre A e B é igual a C");
        }
    }
}