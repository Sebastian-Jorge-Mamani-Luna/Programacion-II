package Juego1;

public class JuegoAdivinaPar extends JuegoAdivinaNumero{
	
	public JuegoAdivinaPar(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	
	@Override
	public boolean validaNumero(int numeroJug) {
		if(numeroJug >= 0 && numeroJug <= 10 && numeroJug % 2 == 0) {
			return true;
		}else {
			System.err.println("error...");
			return false;
		}
	}
}
