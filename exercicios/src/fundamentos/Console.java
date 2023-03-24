package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n\n", 1, 2, 3, 4, 5, 6);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite o seu sálario: ");
		float salario = entrada.nextFloat();
		
		System.out.printf("%s recebe R$ %.2f.", nome, salario);
		
		entrada.close();
	}
}
