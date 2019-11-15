
package lab5_sergiosuazo;

public class Carta {
    private String nombre, objetivo, velocidad, tipo;
    private int dano, vida;

    public Carta() {
    }

    public Carta(String nombre, String objetivo, String velocidad, String tipo, int dano, int vida) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.velocidad = velocidad;
        this.tipo = tipo;
        this.dano = dano;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
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

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", objetivo=" + objetivo + ", velocidad=" + velocidad + ", tipo=" + tipo + ", dano=" + dano + ", vida=" + vida + '}';
    }
    
    
}
