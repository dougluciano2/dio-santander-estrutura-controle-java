package model;

import java.util.Scanner;

public class Exercicio04 {

    private Scanner sc = new Scanner(System.in);
    private Integer number;
    private Integer numberToBeVerified;
    private boolean keepVerify = true;

    public void initExercicio(){
        System.out.print("Informe um número: ");
        number = sc.nextInt();
        while (keepVerify){
            System.out.print("Informe o número para verificação: ");
            numberToBeVerified = sc.nextInt();
            if (numberToBeVerified < number){
                System.out.printf("Informe um número maior que  %s\n", number);
                continue;
            }
            var result = numberToBeVerified % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n", numberToBeVerified, number, result);
        }
    }
}
