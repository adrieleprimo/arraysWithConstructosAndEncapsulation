package application;

import java.util.Scanner;

import entities.Idade;

public class MaisVelho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar? ");
		int N = sc.nextInt();
		Idade[] vect = new Idade[N];
		int sum = 1;
		for (int i = 0; i < vect.length; i++) {
			System.out.println("Dados da " + sum + "a pessoa:");
			System.out.print("Nome: ");
			sum++;
			String name = sc.next();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			vect[i] = new Idade(age, name);
		}
		int maisVelho = 0;
		int total=0;
		String verdadeiro = null;
		System.out.println("A PESSOA MAIS VELHA: ");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getAge() > maisVelho) {
				maisVelho = vect[i].getAge();
				 total = i;
				
			}
			
		}
		System.out.print(verdadeiro = vect[total].getName());

		sc.close();

	}

}
