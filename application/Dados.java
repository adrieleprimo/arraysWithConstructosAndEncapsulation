package application;

import java.util.Scanner;

import entities.Pessoas;

public class Dados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantas pessoas serao digitadas? ");
		int N = sc.nextInt();
		Pessoas[] vect = new Pessoas[N];
		int sum = 1;
		for (int i = 0; i<vect.length;i++) {
			System.out.print("Altura da "+sum+ "a pessoa: ");
			double altura = sc.nextDouble();
			System.out.print("Genero da " + sum + "a pessoa: ");
			char genero = sc.next().charAt(0);
			vect[i] = new Pessoas (altura, genero);
			sum++;
		}
		double menorAltura = Integer.MAX_VALUE;
		double maiorAltura = Integer.MIN_VALUE;
		for (int i = 0; i< vect.length;i++) {
			
		
			if (vect[i].getAltura() < menorAltura) {
				menorAltura = vect[i].getAltura();
				
			}
		}
		for(int i = 0;i<vect.length;i++) {
			if (vect[i].getAltura ()> maiorAltura) {
				maiorAltura=vect[i].getAltura();
			}
			
		}
		double alturaMulheres = 0;
		int totalGenero = 0;
		int totalHomens = 0;
		for(int i= 0; i<vect.length;i++) {
			if(vect[i].getGenero() == 'F') {
				alturaMulheres+=vect[i].getAltura();
				totalGenero++;
			}
			else {
				totalHomens++;
			}
			
		}
		
	
		System.out.printf("Menor altura = %.2f" , menorAltura);
		System.out.printf("\nMaior altura = %.2f", maiorAltura);
		System.out.printf("\nMedia das alturas das mulheres = %.2f", alturaMulheres/totalGenero);
		System.out.printf("\nNumero de homens = %d ", totalHomens);
		sc.close();

	}

}
