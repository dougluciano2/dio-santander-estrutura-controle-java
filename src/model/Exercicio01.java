package model;

import java.util.Scanner;

public class Exercicio01 {

    Scanner sc = new Scanner(System.in);
    private Integer multiplicador;

    public void initExercicio(){
        System.out.print("Digite o multiplicador: ");
        multiplicador = sc.nextInt();

        System.out.println();
        System.out.println("Iniciando a tabuada de " + multiplicador);

        for (int i = 0; i <= 10; i++){
            System.out.println(multiplicador +  " X " + i + " = " + (multiplicador * i) );
        }
    }

}
