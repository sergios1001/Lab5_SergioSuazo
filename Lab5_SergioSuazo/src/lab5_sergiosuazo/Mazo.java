
package lab5_sergiosuazo;

import java.util.ArrayList;

public class Mazo {
    private int costo;
    private ArrayList<Carta> carta=new ArrayList();


    public Mazo() {
    }

    public Mazo(int costo) {
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Mazo{" + "costo=" + costo + ", carta=" + carta + '}';
    }

}
