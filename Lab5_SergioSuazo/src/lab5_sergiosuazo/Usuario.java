
package lab5_sergiosuazo;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    private String nombre,apellido,username,contra;
    private int edad;
    private Color color;
    private Date fecha;
    private ArrayList<Mazo> mazo=new ArrayList();

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String username, String contra, int edad, Color color, Date fecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
        this.contra = contra;
        this.edad = edad;
        this.color = color;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Mazo> getMazo() {
        return mazo;
    }

    public void setMazo(ArrayList<Mazo> mazo) {
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", username=" + username + ", contra=" + contra + ", edad=" + edad + ", color=" + color + ", fecha=" + fecha + '}';
    }
    
    
}
