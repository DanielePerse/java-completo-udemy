package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;

	public Pessoa(String nome, double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if (comida != null) {
			
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		
		return "Olá eu sou " + nome + " e tenho " + peso + " Kgs.";
	}
}
