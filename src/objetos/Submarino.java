package objetos;

public class Submarino extends Punto {

	private int puntosVida;
	private int cantidadDeVidas;
	private int puntaje;
	
	
	public Submarino(int posicionX, int posicionY, int velocidad, int puntosVida, int cantidadDeVidas, int puntaje) {
		super(posicionX, posicionY, velocidad);
		this.cantidadDeVidas = 3;
		this.puntaje = 0;
		this.puntosVida = 100; 
	}

}
