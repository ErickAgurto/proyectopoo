package Bases;

import java.util.Date;

public class Jugador extends Persona{
    private String posicion;
    private int dorsal;
    private double estatura;
    private double peso;

    public Jugador(String posicion, int dorsal, double estatura, double peso, String nombre, String apellido, Date fechaNat, String sexo, String nacionalidad, String dni) {
        super(nombre, apellido, fechaNat, sexo, nacionalidad, dni);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.estatura = estatura;
        this.peso = peso;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public double getEstatura() {
        return estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
