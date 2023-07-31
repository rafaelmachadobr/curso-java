package oo.heranca;

public class Jogador {

	public int vida = 100;
	public int x;
	public int y;
	
	protected Jogador(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean atacar(Jogador openente) {
		int deltaX = Math.abs(x - openente.x);
		int deltaY = Math.abs(y - openente.y);
		
		if (deltaX == 0 && deltaY == 1) {
			openente.vida -= 10;
			return true;
		} else if (deltaX == 1 && deltaY == 0) {
			openente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean andar(Direcao direcao) {
		switch (direcao) {
		case NORTE:
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		
		return true;
	}
}
