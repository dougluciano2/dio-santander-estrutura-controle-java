package service;

import model.Exercicio01;
import model.Exercicio02;
import model.Exercicio03;
import model.Exercicio04;

import java.util.Scanner;

public class AuxiliaryCaller {

    Scanner sc = new Scanner(System.in);
    private Integer option;
    Exercicio01 exercicio01 = new Exercicio01();
    Exercicio02 exercicio02 = new Exercicio02();
    Exercicio03 exercicio03 = new Exercicio03();
    Exercicio04 exercicio04 = new Exercicio04();


    public void caller(){
        System.out.println("ESCOLHA UMA OPÇÃO:");
        System.out.println("1 - Exercício 1 - Tabuada");
        System.out.println("2 - Exercício 2 - Calcular IMC");
        System.out.println("3 - Exercício 3 - Números pares e ímpares");
        System.out.println("4 - Exercício 4 - Loop No. divisível com resto");
        System.out.println("0 - Sair");
        System.out.print("Opção: ");
        option = sc.nextInt();

        switch (option){
            case 1 -> exercicio01.initExercicio();
            case 2 -> exercicio02.initExercicio();
            case 3 -> exercicio03.initExercicio();
            case 4 -> exercicio04.initExercicio();
            default -> System.out.println("Opção inválida!");
        }
    }
}
