package classe;

public class DataTeste {
	
	public static void main (String[] args) {
		
		// instanciando classe
		Data d1 = new Data();
		
		d1.dia = 8;
		d1.mes = 8;
		d1.ano = 1985;
		
		System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		// inferência
		var d2 = new Data();
		
		d2.dia = 24;
		d2.mes = 9;
		d2.ano = 1982;
		
		// refatorado utilizando o método criado em data para formatr direto
		System.out.printf(d2.obterDataFormatada());
	}

}
