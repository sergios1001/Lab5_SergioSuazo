
package lab5_sergiosuazo;

import java.util.ArrayList;
import java.util.Date;

public class Clan {
    private String nombre,tipo,lider;
    private Date fecha;
    private ArrayList<Usuario> miembros=new ArrayList();

    public Clan() {
    }

    public Clan(String nombre, String tipo, String lider, Date fecha) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.lider = lider;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLider() {
        return lider;
    }

    public void setLider(String lider) {
        this.lider = lider;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    @Override
    public String toString() {
        return "Clan{" + "nombre=" + nombre + ", tipo=" + tipo + ", lider=" + lider + ", fecha=" + fecha + ", miembros=" + miembros + '}';
    }
    
    
}
