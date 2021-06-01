package classe;

public class ProdutoTeste {

		public static void main(String[] args) {
			
			// new - palavra reservada para instanciar minha classe e conseguir acessá-la. Não precisamos importar a classe Prouto, pois está no msms pct
			Produto p1 = new Produto("Notebook", 4000.00);
//			p1.nome = "Notebook";
//			p1.preco = 4000.00;
//			p1.desconto = 0.25;
			
			var p2 = new Produto();
			p2.nome = "Caneta Preta";
			p2.preco = 12.56;		
			
			// tem que ficar bem claro que vc está alterando um membro da classe q é static
			Produto.desconto = 0.50;
			
			System.out.println(p1.nome + " " + p1.precoComDesconto());
			System.out.println(p2.nome + " " + p2.precoComDesconto());
			
			// refatoramos para chamar o método criado na classe Produto
			double precoFinal1 = p1.precoComDesconto(0.2);
			double precoFinal2 = p2.precoComDesconto();
			double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

			System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
		}
}
