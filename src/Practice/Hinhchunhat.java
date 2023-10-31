package Practice;

public class Hinhchunhat extends Hinhhoc {
	private double a;
	private double b;
	public Hinhchunhat() {
		
	}
	public Hinhchunhat(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double dientichchunhat() {
		double s = a*b;
		return s;
		
	}
	
}
