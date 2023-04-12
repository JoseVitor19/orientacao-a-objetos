package Lista1;

import java.util.Scanner;

public class Programa3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ano = 0, mes = 0, dia = 0, total_dias = 0;

        System.out.print("Digite uma idade em anos: ");
        ano = sc.nextInt();
        System.out.print("Digite uma idade em meses: ");
        mes = sc.nextInt();
        System.out.print("Digite uma idade em dias: ");
        dia = sc.nextInt();

        sc.close();

        total_dias = (ano * 365) + (mes * 30) + dia;
        System.out.println("A idade em dias eh: " + total_dias + " dias");
    }   
}
