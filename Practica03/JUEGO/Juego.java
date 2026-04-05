package Juego1;

public class Juego {
	private int numeroDeVidas;
	private int record;
	
	public Juego(int numeroDeVidas) {
		this.numeroDeVidas = numeroDeVidas;
		this.record = 0;
	}
	
	public void reiniciaPartida() {
		this.numeroDeVidas = numeroDeVidas;
		this.record = 0;
	}
	

	public void actualizaRecord() {
		this.record ++;
	}
	
	public boolean quitaVida() {
		this.numeroDeVidas --;
		if(this.numeroDeVidas > 0) {
			return true;
		}else {
			return false;
		}
		
	}
}
