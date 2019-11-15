
package lab5_sergiosuazo;

public class Carta {
    private String nombre;
    private int dano, vida;

    public Carta() {
    }
    
    public Carta(String nombre, int dano, int vida) {
        this.nombre = nombre;
        this.dano = dano;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        return nombre;
    }


    
}
