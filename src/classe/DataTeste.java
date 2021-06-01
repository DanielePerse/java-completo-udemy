package classe;

public class DataTeste {
	
	public static void main (String[] args) {
		
		// instanciando classe - usando o construtor padrão
		Data d1 = new Data();
		// alterando só o ano
		d1.ano = 2021;
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		// inferência - usando o contrutor com parametros
		var d2 = new Data(31, 12, 2020);
		
//		d2.dia = 24;
//		d2.mes = 9;
//		d2.ano = 1982;
//		
		// refatorado utilizando o método criado em data para formatr direto
		System.out.printf(d2.obterDataFormatada());
	}

}
