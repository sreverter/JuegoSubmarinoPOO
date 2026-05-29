package objetos;

public abstract class Punto {
	
	public int posicionX;
	public int posicionY;
	public int velocidad;
	
	public Punto(int posicionX, int posicionY, int velocidad) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
		this.velocidad = velocidad;
	}
}
