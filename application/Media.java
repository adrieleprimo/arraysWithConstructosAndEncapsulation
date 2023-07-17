package application;

import java.text.DecimalFormat;
import java.util.Scanner;

import entities.ValoresMedia;

public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int N = sc.nextInt();
		ValoresMedia[] vect = new ValoresMedia[N];
		for ( int i = 0; i < vect.length;i++) {
			System.out.print("Digite um numero: ");
			double number = sc.nextDouble();
			vect [i] = new ValoresMedia(number);
		}
		double media = 0;
		
		for (int i = 0;i<vect.length;i++) {
			media+=vect[i].getNumber();
			
		}
		double result = media/N;
		System.out.printf("MEDIA DO VETOR: %.3f\n", result);
		double abaixo = 0;
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:" );
		for (int i= 0;i<vect.length;i++) {
			if (vect[i].getNumber() < result) {
				abaixo=vect[i].getNumber();
				DecimalFormat formato = new DecimalFormat("#.1");
				String numero = formato.format(abaixo);
				System.out.println(abaixo);
			}
		}
		
		sc.close();

	}

}
