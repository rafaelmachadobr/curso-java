package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	Ferrari() {
		super(315);
	}
	
	Ferrari(int velociadeMaxima) {
		super(velociadeMaxima);
		delta = 15;
	}
	
//	@Override
//	void acelerar() {
//		velocidadeAtual += 15;
//	}
}
