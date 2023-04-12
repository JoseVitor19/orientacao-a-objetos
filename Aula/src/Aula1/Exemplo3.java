package Aula1;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        // Saída e entrada de dados
        String nome;
        int idade;
        float salario;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine(); // Leitura de String
        System.out.println("Seu nomme: "+nome);

        System.out.print("Digite sua idade: ");
        idade = sc.nextInt(); // Leitura de Integer
        System.out.println("Sua idade: "+idade);

        System.out.print("Digite seu salário: ");
        salario = sc.nextFloat();// Leitura de Integer
        System.out.println("Seu salário: "+salario);

        //Conversão de tipo
        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(sc.next());

        sc.close();
    }
}
