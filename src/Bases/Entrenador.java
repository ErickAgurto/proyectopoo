package Bases;

import java.util.Date;

public class Entrenador extends Persona{
    private String idFederacion;

    public Entrenador(String idFederacion, String nombre, String apellido, Date fechaNat, String sexo, String nacionalidad, String dni) {
        super(nombre, apellido, fechaNat, sexo, nacionalidad, dni);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
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
    
}
