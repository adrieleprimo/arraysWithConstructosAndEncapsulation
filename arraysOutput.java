package arraysVetores;

import java.util.Scanner;

import entities.price;

public class arraysOutput {

	

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		price Price = new price();
		
		System.out.print("Enter a quantity of products: ");
		Price.setN(sc.nextInt());
		double[] vect = new double[Price.getN()];
		 
		for (int i = 0; i<Price.getN(); i++) {
			System.out.print("Enter a name product: ");
			Price.setName(sc.next());
			System.out.print("Enter the price of the product: ");
			vect[i] = sc.nextDouble();
			System.out.println();
			
		}
		
		double sum = 0;
		for (int i = 0; i < Price.getN(); i++) {
			sum+=vect[i];
			Price.setPrice(sum);
		}
		System.out.print(Price);
		
		sc.close();

	}

}
