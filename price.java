package entities;

import arraysVetores.arraysOutput;

public class price extends arraysOutput {
	 String name;
	 double price;
	 int N;
	public price() {
		
	}
	public price (String name, double price, int N ) {
		
		this.name = name;
		this.price = price;
		this.N = N;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

	public double price() {
		return price;
	}
	public double  totalValue(double value) {
		return this.price += value;
		
	}
	public String toString() {
		return "AVERAGE PRICE = " + String.format("%.2f", price()/N);
	}
	public int getN() {
		return N;
	}
	public void setN(int n) {
		N = n;
	}
}
