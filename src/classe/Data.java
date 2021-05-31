package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	String obterDataFormatada() {
		String dataFormatada = "%d/%d/%d";
		return String.format(dataFormatada, dia, mes, ano);
	}
}
