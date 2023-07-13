package application;

import java.util.Scanner;

import entities.Height;

public class Person {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas serão digitadas? ");
		int N = sc.nextInt();
		Height[] vect = new Height[N];
		int sum = 0;
		
		
		for (int i = 0;  i< vect.length; i++) {
			sum += 1;
			System.out.println("Dados da " + sum + "a pessoa");
			System.out.print("Nome: ");
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Height(name, age, height);
			System.out.println();
			
			
		}
		double total = 0;
		for (int i = 0; i < vect.length; i++) {
			total += vect[i].getHeight();

		}
		double media = total / vect.length;
		System.out.printf("Altura média: %.2f ", media);
		System.out.print("\nPessoas com menos de 16 anos: ");
		double ageAll = 0;
		
		for (int i =0; i <vect.length;i++) {
					
			if (vect[i].getAge() < 16) {
				ageAll ++;	
			
	}
		}
		double totalAge = (ageAll/vect.length)*100;
		System.out.println( totalAge + "%");
		String names = null;
		for (int i=0; i<vect.length;i++) {
			names = vect[i].getName();
			if (vect[i].getAge() < 16) {
				System.out.println(names);
		}	
		}
		
		
		
		

		

		
		
		
		sc.close();

	}

}
