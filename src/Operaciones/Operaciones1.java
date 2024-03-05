package Operaciones;

public abstract class Operaciones1 {
	
	protected double num1;
	protected double num2;
	
	public double getValor1() {
		return num1;
	}

	public void setValor1(double num1) {
		this.num1 = num1;
	}
	
	public double getValor2() {
		return num2;
	}

	public void setValor2(double num2) {
		this.num2 = num2;
	}
	
	public Operaciones1(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Operaciones1() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	public abstract double resultado1();
}