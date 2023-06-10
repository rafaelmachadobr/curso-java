package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean trabalho1 = true;
		boolean trabalho2 = false;
		
		System.out.println("Comprou uma TV de 50 polegadas:");
		System.out.println(trabalho1 && trabalho2);
		
		System.out.println("Comprou uma TV de 32 polegadas:");
		System.out.println(trabalho1 ^ trabalho2);
		
		System.out.println("Tomou sorvete com a familia no shopping:");
		System.out.println(trabalho1 || trabalho2);
		
		System.out.println("A familia ficou em casa:");
		System.out.println(!trabalho1 && !trabalho2);
	}
}
