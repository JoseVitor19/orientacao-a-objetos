package Lista1;

import java.util.Scanner;

public class Programa2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0, num2 = 0;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();

        sc.close();

        if(num1 != num2){
            System.out.println("Os numeros sao diferentes!");
            if(num1 % 2 == 0 && num2 % 2 == 0) {
                System.out.println("Os numeros "+num1+" e "+num2+" sao pares!");
            } else if(num1 % 2 == 0 && num2 % 2 != 0){
                System.out.println("numero "+num1+" eh par!");
                System.out.println("numero "+num2+" eh impar!");
            } else if(num1 % 2 != 0 && num2 % 2 == 0){
                System.out.println("numero "+num1+" eh impar!");
                System.out.println("numero "+num2+" eh par!");
            } else {
                System.out.println("Os numeros "+num1+" e "+num2+" sao impares!");
            }
        } else {
            System.out.println("Os numeros sao iguais!");
        }
    }
}
