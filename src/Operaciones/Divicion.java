package Operaciones;

public class Divicion extends Operaciones1{

	double resultado = 0;

	public Divicion(double num1 , double num2) {
			resultado = num1/num2;
			if (Double.isInfinite(resultado)) 
				throw new IllegalArgumentException("No puede dividir por cero");
	}

	@Override
	public double resultado1() {
		return resultado;
	}
}