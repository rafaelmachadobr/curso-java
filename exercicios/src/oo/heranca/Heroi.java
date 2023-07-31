package oo.heranca;

public class Heroi extends Jogador {
	
	public Heroi(int x, int y) {
		super(x, y);
	}
	
	@Override
	public boolean atacar(Jogador openente) {
		boolean ataque1 = super.atacar(openente);
		boolean ataque2 = super.atacar(openente);
		return ataque1 || ataque2;
	}
}
