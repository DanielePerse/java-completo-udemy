package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informações do funcionario
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
    	// short numeros = 34567 -> não posso ultrapassar os bytes, erro!
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // posso separar a milhagem dessa maneira, p facilitar a leitura. Colocou um L no final que daí entende que é um long
		
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipo booleano
		boolean estaDeFerias = false;
		
		// tipo caractere
		char status = 'A'; // A funcionario Ativo
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
	}
}
