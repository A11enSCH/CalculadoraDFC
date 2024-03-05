package Operaciones;

public class Combinatoria extends Operaciones{
	
	long aux1=1, aux2=1;
	
	public Combinatoria (long num1, long num2) throws Exception{
		long aux=1;
		aux=num1-num2;
		if(num2>=num1) {
			throw new Exception("El numero que representa r! no puede ser mayor que n!");
		}else if(num2==0) {
			throw new Exception("No se puede dividir por 0");
		}else {
			for (long i=num1; i>=aux; i--) {
				aux1*=i;
			}
		}for(long i=2; i<=num2; i++) {
			aux2*=i;
		}
	}

	@Override
	public long resultado() {
		return aux1/aux2;
	}
}
