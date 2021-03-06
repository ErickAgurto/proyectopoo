package Bases;
import java.util.Date;
public class Persona {
    protected String nombre;
    protected String apellido;
    protected Date fechaNat;
    protected String sexo;
    protected String nacionalidad;
    protected String dni;

    public Persona(String nombre, String apellido, Date fechaNat, String sexo, String nacionalidad, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNat = fechaNat;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public Date getFechaNat() {
        return fechaNat;
    }

    public String getSexo() {
        return sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNat(Date fechaNat) {
        this.fechaNat = fechaNat;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
}
