package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);
	
	default String legal() {
		return "Legal";
	}
	
	default String muitoLegal() {
		return "Muito legal";
	}
}
