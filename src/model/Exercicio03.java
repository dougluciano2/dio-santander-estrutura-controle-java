package model;

import java.util.Scanner;

public class Exercicio03 {

    Scanner sc = new Scanner(System.in);

    Integer primeiro, segundo, escolha;


    public void initExercicio(){
        System.out.print("Digite o primeiro número: ");
        primeiro = sc.nextInt();

        do {
            System.out.print("Digite o segundo número (maior que o primeiro): ");
            segundo = sc.nextInt();
            if (segundo <= primeiro) {
                System.out.println("O segundo número deve ser maior que o primeiro.");
            }
        } while (segundo <= primeiro);


        do {
            System.out.println("Digite 1 para ver os números pares ou 2 para ver os números ímpares");
            System.out.print("Opção: ");
            escolha = sc.nextInt();
        } while (escolha != 1 && escolha != 2);

        System.out.println("\nNúmeros " + escolha + " entre " + segundo + " e " + primeiro + " em ordem decrescente:");

        for (int i = segundo; i >= primeiro; i--) {
            if (escolha == 1 && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha == 2 && i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

}
