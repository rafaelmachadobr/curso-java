package fundamentos;

public class ObjetoVsPrimitivo {
	public static void main(String[] args) {
		
		String s = new String("Texto");
		s.toLowerCase();
		
		// Wrappers s�o a vers�o objeto dos tipos primitivos
		int a = 123;	
		System.out.println(s);
	}
}
