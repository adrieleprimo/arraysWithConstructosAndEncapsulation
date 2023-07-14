package application;


import java.util.Scanner;

import entities.Larger;

public class Position {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos numeros você vai digitar? ");
		int N = sc.nextInt();
		Larger [] vect = new Larger[N];
		for (int i = 0; i< vect.length; i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect[i] = new Larger (number);	
		}
		double value = 0;
		int posicao = 0;
		for(int i = 0; i< vect.length;i++) {
			
			if (vect[i].getNumber() > value) {
					value = vect[i].getNumber();
					posicao = i;
					
					
				
			}
		}
		
		System.out.println("MAIOR VALOR = " + value);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao );
		
		sc.close();

	}

}
