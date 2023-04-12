package Lista1;

import java.util.Scanner;

public class Programa1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numA = 0, numB = 0, aux = 0;

        System.out.print("Digite um numero: ");
        numA = sc.nextInt();

        System.out.print("Digite outro numero: ");
        numB = sc.nextInt();

        sc.close();

        aux = numA;
        numA = numB;
        numB = aux;

        System.out.println("Os numeros digitados em ordem inversa:");
        System.out.println("A: " + numA);
        System.out.println("B: " + numB);
    }
}
