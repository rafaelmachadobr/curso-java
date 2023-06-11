package fundamentos.operadores;

public class Ternario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		String resultadoPacial = media >= 5 ? "em recupera��o." : "reprovado.";
		String resultadoFinal = media >= 7 ? "aprovado." : resultadoPacial;
		
		System.out.println("O aluno est� " + resultadoFinal);
		
		double nota = 9.9;
		boolean bomComportamento = false;
		boolean passoPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passoPorMedia;
		String resultado = temDesconto ? "sim" : "n�o";
		
		System.out.println("Tem desconto? " + resultado);
	}
}
