package Operaciones;

public abstract class Operaciones {
	
	protected long num1;
	protected long num2;
	
	public double getValor1() {
		return num1;
	}

	public void setValor1(long num1) {
		this.num1 = num1;
	}
	
	public double getValor2() {
		return num2;
	}

	public void setValor2(long num2) {
		this.num2 = num2;
	}
	
	public Operaciones(long num1, long num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public Operaciones() {
		this.num1 = 0;
		this.num2 = 0;
	}
	
	public abstract long resultado();
}
