package Juego1;

public class Aplicacion {

	public static void main(String[] args) {
		//EJERCICIO 1
		
		JuegoAdivinaNumero jan = new JuegoAdivinaNumero(3);
		jan.juega();
	
		
		//EJERCICIO 2
		
		//INSTANCEANDO LOS 3 JUEGOS
		JuegoAdivinaNumero jan1 = new JuegoAdivinaNumero(3);
		jan1.juega();
		
		JuegoAdivinaPar jap1 = new JuegoAdivinaPar(3);
		jap1.juega();
		
		JuegoAdivinaImpar jai1 = new JuegoAdivinaImpar(3);
		jai1.juega();
	}

}
