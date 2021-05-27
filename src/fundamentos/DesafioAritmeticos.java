package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double expressaoA = (Math.pow(6 * (3 + 2), 2)) / 3 * 2;
		
		double expressaoB = Math.pow(((1 - 5) * (2 - 7) / 2), 2);
		double diminuir = expressaoA - expressaoB;

		double expressaoC = Math.pow(diminuir, 3);
		
		double expressaoD = Math.pow(10, 3);
		
		double expressaoFinal = expressaoC / expressaoD;
		
		System.out.println("O resultado final é: " + expressaoFinal);
		
		// resposta:
		
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		
		double superiorA = numA / denA;
		double superiorB = Math.pow(numB / denB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		double inferior = Math.pow(10, 3);
		
		double resultado = superior / inferior;
		
		System.out.println("O resultado é " + resultado);
	}

}
