package Main;

import Operaciones.*;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Operaciones1 d;
		d = new Divicion(5,3);
		System.out.println(d.resultado1());
		
		Operaciones f;
		f = new Factorial(5,0);
		System.out.println(f.resultado());
		
		Operaciones c;
		c = new Combinatoria(10,5);
		System.out.println(c.resultado());
		
	}
}
