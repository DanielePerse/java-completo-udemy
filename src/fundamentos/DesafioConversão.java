package fundamentos;

import java.util.Scanner;

public class DesafioConversão {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe seu salário 1: ");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe seu salário 2: ");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Informe seu salário 3: ");
		String salario3 = entrada.nextLine().replace(",", ".");
		
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		
		double mediaSalario = (num1 + num2 + num3) / 3;
		
		System.out.println("A média de 3 meses de salário é: " + mediaSalario);
		entrada.close();
	}
}
