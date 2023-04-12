package Lista1;

import java.util.Scanner;

public class Programa4 {

	public static void main(String[] args) {
		
	    Scanner sc = new Scanner(System.in);
	        
	    float num1 = 0f, num2 = 0f, num3 = 0f, num4 = 0f, num5 = 0f, num6 = 0f;
		float soma1 = 0f, soma2 = 0f, media1 = 0f, media2 = 0f, medias = 0f;
	        
	    System.out.print("Digite um numero: ");
	    num1 = sc.nextInt();

		System.out.print("Digite outro numero: ");
	    num2 = sc.nextInt();

		System.out.print("Digite outro numero: ");
	    num3 = sc.nextInt();

		System.out.print("Digite outro numero: ");
	    num4 = sc.nextInt();

		System.out.print("Digite outro numero: ");
	    num5 = sc.nextInt();

		System.out.print("Digite outro numero: ");
	    num6 = sc.nextInt();

		sc.close();

		soma1 = num1 + num2 + num3;
		soma2 = num4 + num5 + num6;    
	    media1 = soma1 / 3;
	    media2 = soma2 / 3;
	    medias = media1+media2;

	    System.out.println("A media dos 3 primeiros numeros digitados eh " +media1);
	    System.out.println("A media dos 3 ultimos numeros digitados eh " +media2);
	    System.out.println("A soma das medias eh " +medias);
	}
}
