package objetos;

public class Barco extends Punto{
	
	private int numero = 1;
	private char direccionDesplazamiento;
	private int posicionDeLanzado;
	
	
	public Barco(int posicionX, int posicionY, int velocidad, int numero, char direccionDesplazamiento, int posicionDeLanzado) {
		super(posicionX, posicionY, velocidad);
		this.numero = numero;
		this.direccionDesplazamiento = direccionDesplazamiento;
		this.posicionDeLanzado = posicionDeLanzado;
	
	}
}
