package application;

import java.util.Scanner;

import entities.VetorSum;

public class Sum {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.print("Quantos numeros você vai digitar? ");
	int N = sc.nextInt();
	VetorSum [] vect = new VetorSum[N];
	for (int i = 0; i < vect.length; i++) {
		System.out.print("Digite um numero: ");
		double  number = sc.nextDouble();
		vect[i] = new VetorSum(number);
	}
	double sum = 0;
	double total = 0;
	System.out.print("VALORES = ");
	for(int i = 0; i< vect.length;i++) {
		
		total = vect[i].getNumber();
		System.out.print(total + " ");
		sum += vect[i].getNumber();
		
	}
	double media = sum/vect.length;
	
	System.out.printf("\nSOMA = %.1f" , sum);
	System.out.printf("\nMEDIA = %.1f", media);
	
	sc.close();

	}

}
