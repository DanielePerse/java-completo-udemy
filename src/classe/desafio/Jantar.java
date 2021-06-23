package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida comida1 = new Comida("Arroz", 0.500);
		Comida comida2 = new Comida("Feijão", 0.200);
		Pessoa pessoa = new Pessoa("Dany", 70);
		
		System.out.println(pessoa.apresentar());
		
		pessoa.comer(comida1);
		System.out.println(pessoa.apresentar());
		
		pessoa.comer(comida2);
		System.out.println(pessoa.apresentar());
	}
}
