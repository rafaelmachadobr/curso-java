package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Bom dia!".charAt(7));
		
		String s = "Olá, Mundo";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Olá"));
		System.out.println(s.toLowerCase().startsWith("olá"));
		System.out.println(s.toUpperCase().endsWith("MUNDO"));
		System.out.println(s.length());
		System.out.println(s.equals("olá, mundo"));
		System.out.println(s.equalsIgnoreCase("olá, mundo"));
		
		var nome = "Sergio";
		var sobrenome = "Santos";
		var idade = 41;
		var salario = 8023.432;
		
		System.out.println("\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n\n");
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
	}
}
