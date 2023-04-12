package Lista1;

import java.util.Scanner;

public class Programa7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0, antecessor = 0, sucessor = 0;

        System.out.print("Digite um numero inteiro: ");
        num = sc.nextInt();

        antecessor = num - 1;
        if(antecessor % 2 != 0){
            antecessor--;
        }

        sucessor = num + 1;
        if(sucessor % 2 != 0){
            sucessor++;
        }

        System.out.println("Numero digitado: " + num);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);
        
        sc.close();
    }
}
