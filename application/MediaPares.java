package application;

import java.util.Scanner;

import entities.ValoresPares;

public class MediaPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");		
		int N = sc.nextInt();
		ValoresPares[] vect = new ValoresPares[N];
		for (int i = 0; i < vect.length;i++) {
			System.out.print("Digite um numero: ");
			int number = sc.nextInt();
			vect[i] = new ValoresPares (number);
		}
		double sum = 0;
		int total = 0;
		int nopair = 0;
		for (int i = 0; i<vect.length;i++) {
			
			if(vect[i].getNumber() %2 == 0) {
				sum +=vect[i].getNumber();
				total++;
				
			}
			
			
			
		
			
		}
		if (sum > 0) {
			System.out.print("MEDIA DOS PARES = ");
			System.out.println(sum/total);
		}
		else {
			System.out.println("NENHUM NUMERO PAR");
		}
	
			
			
			
		
		
		sc.close();

	}

}
