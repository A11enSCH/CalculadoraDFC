package Operaciones;

public class Factorial extends Operaciones{
	
	private long aux=1;

	public Factorial(long num1, long num2) throws Exception{
		
		if(num1<0) {
			throw new Exception("El numero es un numero negativo");
		}else {
		for (int i=2; i<=num1; i++) {
			aux*=i;
		}
		}
	}

	@Override
	public long resultado() {
		return aux;
	}
}