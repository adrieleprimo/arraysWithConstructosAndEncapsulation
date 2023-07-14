package application;

import java.util.Scanner;
import entities.Sum;
public class Vetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int N = sc.nextInt();
		Sum[] vect = new Sum[N];
		System.out.println("Digite os valores do vetor A:");
		for ( int i = 0; i <vect.length;i++) {
			int a = sc.nextInt();
			vect[i] = new Sum(a);
		}
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i< vect.length; i++) {
			int b = sc.nextInt();
			vect[i] = new Sum(b);
			
		}
		int C = 0;
		
		System.out.println("VETOR RESULTANTE: ");
		for ( int i = 0 ; i <vect.length;i++) {
			C = vect[i].getB()+ vect[i].getA();
			
			System.out.println(C);
		}
		
		
		sc.close();

	}

}
