package entities;

public class VetorSum {
	private double number;

	public VetorSum () {
		
	}
	public VetorSum(double number) {
		
		this.number = number;
	}
	public double getNumber() {
		return number;
	}
	public void setNumber(double number) {
		this.number = number;
	}
	public double total () {
		return number;
	}
	public void totalSum (double value) {
		this.number+=number;
	}
	public void media (double value) {
		this.number = number/number;
	}
	
}
