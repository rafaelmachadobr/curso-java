package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu 1� salario:");
		String valor1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o seu 2� salario:");
		String valor2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite o seu 3� salario:");
		String valor3 = entrada.nextLine().replace(",", ".");
		
		entrada.close();

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double soma = salario1 + salario2 + salario3;
		
		System.out.println("\nA soma dos sal�rios � " + soma);
		System.out.println("A m�dia dos sal�rios � " + soma / 3);
	}
	
}
