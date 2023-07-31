package oo.heranca.desafio;

public class Ferrari extends Carro {
	
	public Ferrari() {
		super(315);
	}
	
	public Ferrari(int velociadeMaxima) {
		super(velociadeMaxima);
		delta = 15;
	}
	
//	@Override
//	public void acelerar() {
//		velocidadeAtual += 15;
//	}
}
