package Bases;

import java.util.Date;

public class Presidente extends Persona {
    
    public Presidente(String nombre, String apellido, Date fechaNat, String sexo, String nacionalidad, String dni) {
        super(nombre, apellido, fechaNat, sexo, nacionalidad, dni);
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getApellido() {
        return apellido;
    }
    @Override
    public Date getFechaNat() {
        return fechaNat;
    }
    @Override
    public String getSexo() {
        return sexo;
    }
    @Override
    public String getNacionalidad() {
        return nacionalidad;
    }
    @Override
    public String getDni() {
        return dni;
    }
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    @Override
    public void setFechaNat(Date fechaNat) {
        this.fechaNat = fechaNat;
    }
    @Override
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    @Override
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    @Override
    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
