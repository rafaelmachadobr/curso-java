package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		System.out.println("Comprar TV de 50 polegadas:");
		System.out.println(trabalho1 && trabalho2);
		
		System.out.println("Comprar TV de 32 polegadas:");
		System.out.println(trabalho1 ^ trabalho2);
		
		System.out.println("Tomar sorvete com a familia:");
		System.out.println(trabalho1 || trabalho2);
		
		System.out.println("Familia ficar em casa:");
		System.out.println(!trabalho1 && !trabalho2);
	}
}
