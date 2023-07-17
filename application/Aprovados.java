package application;

import java.util.Scanner;

import entities.AprovadosMedia;

public class Aprovados {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Quantos alumos serão digitados? ");
		int N = sc.nextInt();
		AprovadosMedia[] vect = new AprovadosMedia[N];
		int sum = 1;
		for (int i = 0; i< vect.length;i++) {
			System.out.println("Digite nome, primeira e segunda nota do " + sum + "o aluno(a)");
			sum++;
			sc.nextLine();
			String name = sc.nextLine();
			
			double notaUm = sc.nextDouble();
			double notaDois = sc.nextDouble();
			
			
			vect[i] = new AprovadosMedia (notaDois, notaUm, name);
		}
		int media =0 ;
	
		System.out.println("Alunos aprovados: ");
		for(int i = 0; i<vect.length;i++) {
			
			if ((vect[i].getNotaUm()+vect[i].getNotaDois())/2 >= 6.0 ) {
				media = i;
				
				System.out.println(vect[media].getNome());
				
			}
		}
		
		sc.close();

	}

}
