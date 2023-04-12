package Lista1;

import java.util.Scanner;

public class Programa8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = "";
        double altura = 0, peso = 0, imc = 0;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("IMC de %s: %.1f", nome, imc);

        sc.close();
    }
}
