package Lista1;

import java.util.Scanner;

public class Programa6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double salarioMinimo = 0, salario = 0, qtdSalMin = 0;
        
        System.out.print("Digite o valor do salario minimo: R$ ");
        salarioMinimo = sc.nextDouble();

        System.out.print("Digite o valor do seu salario: R$ ");
        salario = sc.nextDouble();

        qtdSalMin = salario/salarioMinimo;

        System.out.printf("Voce recebe %.1f salario(s) minimo(s)!", qtdSalMin);

        sc.close();
    }
}
