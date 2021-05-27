package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		a = 12; // posso iniciar como double l. 6 e depois chamar de novo como inteiro
		System.out.println(a);
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
//		c = 4.5  isso dá erro, pois o tipo da variável c é string e não number!
		
		double d; // variável foi declarada
		d = 123.65; // variável foi inicializada
		System.out.println(d); // usada!
		
//		var e; -> não posso iniciar a variavel em uma linha e instanciá-la em outra
//		e = 123.45;
		
		var e = 123.65;
		System.out.println(e);
		
//		double f = 3;
//		f = 3.4  não posso iniciar como inteiro l. 34 e depois chamar de novo como inteiro
	}
}
