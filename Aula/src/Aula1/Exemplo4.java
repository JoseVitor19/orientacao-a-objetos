/*
 * Operadores Relacionais
 * 
 * == igual
 * != diferente
 * > maior
 * < menor
 * >= maior igual
 * <= menor igual
 * 
 * Operadores Lógicos
 * 
 * || OU
 * && E
 * !  NÃO
 */

package Aula1;

public class Exemplo4 {
    public static void main(String[] args) {
        // Condicionais - Estrutura de Seleção
        int x = 233, y = 45;

        if (x>10 || x>1000) {
            System.out.println("ABACAXI");
        } else {
            System.out.println("BANANA");
        }

        if (x>10 && y>200) {
            System.out.println("MUSTANG");
        } else if(x>10 && y>100){
            System.out.println("BMW");
        } else {
            System.out.println("HONDA");
        }

        //--------------------------------------
        int op = 0;

        switch (op) {
            case 0:
                System.out.println("CABEÇA");
                break;
            case 1:
                System.out.println("OMBRO");
                break;
            case 2:
                System.out.println("JOELHO");
                break;
            case 3:
                System.out.println("PÉ");
                break;   
            default:
                System.out.println("TCHAU");
                break;
        }
    }
}
