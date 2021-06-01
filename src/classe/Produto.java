package classe;

public class Produto {
	// desafio: aplicar desconto geral para todos os produtos. O padrão é 25%, mas quando é data comemorativa varia
	String nome;
	double preco;
	static double desconto = 0.25;
	
	// construtor sem param.
	Produto() {
		
	}
	
	// construtor com param.
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// 2 métodos com mesmo nome, mas assinaturas distintas - ok
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
