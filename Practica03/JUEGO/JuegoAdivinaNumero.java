package Juego1;
import java.util.Scanner;
public class JuegoAdivinaNumero extends Juego{
	
	private int numeroAAdivinar;
	
	public JuegoAdivinaNumero(int numeroDeVidas) {
		super(numeroDeVidas);
	}
	
	public void juega() {
		Scanner leer = new Scanner(System.in);
		super.reiniciaPartida();
		this.numeroAAdivinar = (int)(Math.random()*11);
		
		System.out.println("-----------------INGRESE UN NUMERO ENTRE 0 Y 10------------------");
		int numeroJugador = leer.nextInt(); 
		
		//Para el validaNumero
		if(!validaNumero(numeroJugador)) {
			do {
				numeroJugador = leer.nextInt(); 
			}while(!validaNumero(numeroJugador));
		}
		
		if(this.numeroAAdivinar == numeroJugador) {
			System.out.println("Acertaste!!");
			super.actualizaRecord();
		}else {
			if(super.quitaVida()) {
				
				if(this.numeroAAdivinar > numeroJugador) {
					System.out.println("Pista: El numero a adivinar es mayor");
				}else {
					System.out.println("Pista: El numero a adivinar es menor");
				}
				
				for(int i = 2; i <= 3; i++) {
					numeroJugador = leer.nextInt(); 
					//Para el validaNumero
					if(!validaNumero(numeroJugador)) {
						do {
							numeroJugador = leer.nextInt(); 
						}while(!validaNumero(numeroJugador));
					}
					
					if(this.numeroAAdivinar == numeroJugador) {
						System.out.println("Acertaste!!");
						super.actualizaRecord();
					}else {
						if(super.quitaVida()) {
							if(this.numeroAAdivinar > numeroJugador) {
								System.out.println("Pista: El numero a adivinar es mayor");
							}else {
								System.out.println("Pista: El numero a adivinar es menor");
							}
						}else {
							System.out.println("No hay mas vidas...");
						}
					}
				}	
			}else {
				System.out.println("No hay mas vidas...");
			}
		}
	}
	
	
	public boolean validaNumero(int numeroJug) {
	    return numeroJug >= 0 && numeroJug <= 10;
	}
	
	
}
