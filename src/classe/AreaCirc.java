package classe;

public class AreaCirc {
	double raio;
	// final é um modificador para definir uma constante. Por convenção o PI fica em maiúsculo
	final static double PI = 3.1415;
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);		
	}
}
