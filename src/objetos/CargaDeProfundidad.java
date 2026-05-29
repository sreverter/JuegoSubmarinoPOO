package objetos;

public class CargaDeProfundidad extends Punto {

	private int posicionDeDetonacion;
	
	public CargaDeProfundidad(int posicionX, int posicionY, int velocidad, int posicionDeDetonacion) {
		super(posicionX, posicionY, velocidad);
		this.posicionDeDetonacion = posicionDeDetonacion;
	}
}
