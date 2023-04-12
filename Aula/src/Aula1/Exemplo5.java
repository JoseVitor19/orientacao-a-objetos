package Aula1;

import java.util.Scanner;

public class Exemplo5 {
    public static void main(String[] args) {
        //Estruturas de Repetição
        //for
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" , ");
        }
        System.out.println();

        //while
        int cont = 0;
        while (cont<5) {
            System.out.print(cont+" , ");
            cont++;
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int sair = 1;
        while (sair != 0) {
            System.out.print("Digite 0 para sair: ");
            sair = sc.nextInt();
        }
        System.out.print("Saiu do laço!");
        sc.close();
    }
}
