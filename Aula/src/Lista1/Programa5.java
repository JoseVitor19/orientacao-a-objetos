package Lista1;

import java.util.Scanner;

public class Programa5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double saldo = 0, novo_saldo = 0;

        System.out.print("Digite o valor do saldo: ");
        saldo = sc.nextDouble();

        novo_saldo = saldo + (saldo*(5.0/100.0));

        System.out.println("Saldo com reajuste de 5%: "+novo_saldo);

        sc.close();
    }
}
