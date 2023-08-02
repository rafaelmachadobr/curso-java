package lambdas;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		Produto p = new Produto("iPad", 3235.89, 0.13);
		
		Locale localeBR = new Locale.Builder().setLanguage("pt").setRegion("BR").build();
		
		BinaryOperator<Double> precoComDesconto = (preco, desconto) -> preco * (1 - desconto);
		UnaryOperator<Double> impostoMunicipal = valor -> valor >= 2500 ? valor + (valor * 0.085) : valor;
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		Function<Double, String> formatar = valor -> NumberFormat.getCurrencyInstance(localeBR).format(valor);
		
		String resultado1 = precoComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(formatar).apply(p.preco, p.desconto);
		
		System.out.println(resultado1);
		
	}
}
