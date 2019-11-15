
package lab5_sergiosuazo;

public class Pandilla_Duendes extends Carta{

    private String velocidad,tipo,objetivo;
    private int costo;
    
    public Pandilla_Duendes() {
    }

    public Pandilla_Duendes(String velocidad, String tipo, String objetivo, int costo, String nombre, int dano, int vida) {
        super(nombre, dano, vida);
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.objetivo = objetivo;
        this.costo = costo;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Pandilla_Duendes{" + "velocidad=" + velocidad + ", tipo=" + tipo + ", objetivo=" + objetivo + ", costo=" + costo + '}';
    }
    

    
}
