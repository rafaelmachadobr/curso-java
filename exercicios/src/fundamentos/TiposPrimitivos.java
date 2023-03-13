package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		// Informacaes do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 19;
		short numeroDeVoos = 531;
		int id = 63912;
		long pontosAcumulados = 3_159_825_421L;
		
		// Tipos numericos
		float salario = 2_312.00F;
		double vendasAcumuladas = 2_931_329_193.01;
		
		// Tipo booleano
		boolean estadeFerias = false;
		
		// Tipo caractere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroDeVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Ferias? " + estadeFerias);
		System.out.println("Status: " + status);
	}
}
