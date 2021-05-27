package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	
	public static void main(String[] args) {
		// ler 2 núm diferentes, informar a operação e fazer o cálculo
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe o primeiro número:");
		String num1 = entrada.nextLine();
		
		System.out.print("Informe o segundo número:");
		String num2 = entrada.nextLine();
		
		System.out.print("Informe a operação:");
		String operacao = entrada.nextLine();
		
		double dado1 = Double.parseDouble(num1);
		double dado2 = Double.parseDouble(num2);
		
		double resultado = "+".equals(operacao) ? (dado1 + dado2) : 0;
		resultado = "-".equals(operacao) ? (dado1 - dado2) : resultado;
		resultado = "*".equals(operacao) ? (dado1 * dado2) : resultado;
		resultado = "/".equals(operacao) ? (dado1 / dado2) : resultado;
		
		System.out.println(dado1 + operacao + dado2 + " = " + resultado);
		
		// resposta
		
//		System.out.print("Informe o número: ");
//		double num1 = entrada.nextDouble();
//		
//		System.out.print("Informe o número: ");
//		double num2 = entrada.nextDouble();
//		
//		System.out.print("Informe a operação: ");
//		String op = entrada.next();
//		
//		// Lógica
//		double resultado = "+".equals(op) ? num1 + num2 : 0;
//		resultado = "-".equals(op) ? num1 - num2 : resultado;
//		resultado = "*".equals(op) ? num1 * num2 : resultado;
//		resultado = "/".equals(op) ? num1 / num2 : resultado;
//		resultado = "%".equals(op) ? num1 % num2 : resultado;
//		
//		System.out.printf("%.2f %s %.2f = %.2f",
//				num1, op, num2, resultado);
		entrada.close();
	}

}
