package model;

import java.util.Scanner;

public class Exercicio02 {

    private Double peso;
    private Double altura;
    private Double imc;
    Scanner sc = new Scanner(System.in);

    public void initExercicio(){
        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();
        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.println(calcularImc(peso, altura));
    }

    public String calcularImc(Double peso, Double altura) {
        imc = peso / (altura * altura);

        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade Grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade Grau II (Severa)";
        } else {
            return "Obesidade Grau III (Mórbida)";
        }
    }
}
