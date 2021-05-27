package classe;

public class ProdutoTeste {

		public static void main(String[] args) {
			
			// new - palavra reservada para instanciar minha classe e conseguir acessá-la. Não precisamos importar a classe Prouto, pois está no msms pct
			Produto p1 = new Produto();
			p1.nome = "Notebook";
			p1.preco = 4000.00;
			p1.desconto = 0.25;
			
			var p2 = new Produto();
			p2.nome = "caneta preta";
			p2.preco = 12.56;
			p2.desconto = 0.29;
		}
}
