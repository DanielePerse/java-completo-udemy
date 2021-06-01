package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	// desafio: criar 2 construtores, um padrão e outro que recebe 3 parâmetros. E quando chamar o param terá data default 01/01/1970
	// atenão, não é possível criar construtores com assinaturas iguais!
	public Data(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}

	String obterDataFormatada() {
		String dataFormatada = "%d/%d/%d";
		return String.format(dataFormatada, dia, mes, ano);
	}
}
