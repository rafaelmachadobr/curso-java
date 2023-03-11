package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		final double AJUSTE = 32;
		final double FATOR = 5.0 / 9.0;
		
		double fahrenheit = 86;
		double celcius = (fahrenheit - AJUSTE) * FATOR;
		
		System.out.println("O resultado deu " + celcius + " Celcius");

		fahrenheit = 140;
		celcius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("O resultado deu " + celcius + " Celcius");
	}
}
