package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = new String("texto");
		s.toUpperCase();
		
		//wrappers -> são objetos do tipo primitivo
		// tudo em java é baseado em objetos, menos os 8 tipos primitivos
		int a = 123;
		System.out.println(a);
		
	}
}
