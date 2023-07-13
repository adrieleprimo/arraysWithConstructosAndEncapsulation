package application;

import java.util.Scanner;

import entities.Negatives;

public class Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos numeros voce vai digitar?");
		int N = sc.nextInt();
		Negatives[] vect = new Negatives[N];
		for (int i = 0; i < vect.length;i++) {
			
			if (vect.length<=10) {
				System.out.print("Digite um número: ");
				int number = sc.nextInt();
				vect[i] = new Negatives(number);
			}
			else {
				break;
			}
			
			}
			System.out.println("NUMEROS NEGATIVOS: ");
			int numbers = 0;
			for (int i = 0; i< vect.length;i++) {
				numbers = vect[i].getNumber();
				
				if (numbers < 0) {
					
					System.out.println(numbers);
					
				}
			}
			
		
		
		sc.close();
	}
}


