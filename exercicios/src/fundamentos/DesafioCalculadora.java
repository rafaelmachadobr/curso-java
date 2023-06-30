package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o n�mero: ");
		double num1 = entrada.nextDouble();
		
		System.out.println("Digite o outro n�mero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite a opera��o: (+ - * / %) ");
		String op = entrada.next();
		
		double resultado = op.equals("+") ? num1 + num2 : 0;
		resultado = op.equals("-") ? num1 - num2 : resultado;
		resultado = op.equals("*") ? num1 * num2 : resultado;
		resultado = op.equals("/") ? num1 / num2 : resultado;
		resultado = op.equals("%") ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);
		
		entrada.close();
	}
}
