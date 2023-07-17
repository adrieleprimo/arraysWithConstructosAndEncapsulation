package application;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		int[] vectA = new int[N];
		int[] vectB = new int [N];
		System.out.println("Digite os valores do vetor A:");
		
		for ( int i = 0; i <N;i++) {
			
			vectA[i] = sc.nextInt();
		
			
		}
		
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i<N; i++) {
			
			vectB[i] = sc.nextInt();
	
			
			
		}
		
		
		System.out.println("VETOR RESULTANTE: ");
		int c = 0;
		for(int i = 0; i< N;i++) {
			
			
			System.out.println(c =  vectA[i]+vectB[i]);
			
		}
	
		
	
	
		
		sc.close();

	}

}
