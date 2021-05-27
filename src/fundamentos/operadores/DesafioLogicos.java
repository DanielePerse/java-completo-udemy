package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		// se 1 trabalho der certo comprará tv de 32 polegadas
		// se 2 trabalhos derem ceto comprará tv de 50 polegadas
		// comprando tv a familia vai tomar sorvete
		// os 2 trabalhos deram errados, família fica em casa
		
		boolean trabalhoA = true;
		boolean trabalhoB = true;
		
		String resultadoFinal = "";
		
		if (trabalhoA && trabalhoB) {
			resultadoFinal = "TV de 50 será comprada e família comprará sorvete";
		} else if (trabalhoA || trabalhoB) {
			resultadoFinal = "TV de 32 será comprada e família comprará sorvete";
		} else {
			resultadoFinal = "Família não compra TV e fica em casa";
		}
		
		System.out.println(resultadoFinal);
		
		// Resposta:
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		// Operador Unário!
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\"? " + comprouTV50);
		System.out.println("Comprou TV 32\"? " + comprouTV32);
		System.out.println("Comprou Sorvete? " + comprouSorvete);
		System.out.println("Mais saudável? " + maisSaudavel);
	}

}
