package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2023;
		
		Data d2 = new Data();
		d2.dia = 31;
		d2.mes = 12;
		d2.ano = 2020;
		
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		
	}
}
