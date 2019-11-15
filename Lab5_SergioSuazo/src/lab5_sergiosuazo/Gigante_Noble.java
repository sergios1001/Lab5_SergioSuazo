
package lab5_sergiosuazo;

public class Gigante_Noble extends Carta{
    private String velocidad,tipo,objetivo;
    private int costo;

    public Gigante_Noble() {
    }

    public Gigante_Noble(String velocidad, String tipo, String objetivo, int costo, String nombre, int dano, int vida) {
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
    
}
