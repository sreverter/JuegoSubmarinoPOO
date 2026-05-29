package movimiento;

public class MovimientoBidereccional extends Movimiento implements MovimientoVertical {

    private int velocidadY;

    public MovimientoBidereccional(Area area, int x, int y, int ancho, int alto, int velocidadX, int velocidadY){
        super (area, x, y, ancho, alto, velocidadX);
        this.velocidadY = velocidadY;
    }

    public int moverArriba (){
        int nuevaY = posicionY - velocidadY;
        if (areaJuego.estaDentroVertical(nuevaY, alto)){
            posicionY = nuevaY;
        }
        return posicionY;
        }
    public int moverAbajo (){
        int nuevaY = posicionY + velocidadY;
        if (areaJuego.estaDentroHorizontal(nuevaY, alto)){
            posicionY = nuevaY;

    }
    return posicionY;
    }
}

