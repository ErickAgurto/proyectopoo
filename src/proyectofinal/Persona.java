package proyectofinal;

import java.util.Scanner;

public class Persona implements interfazBase{
    Scanner entrada = new Scanner(System.in);
    protected String nombres;
    protected String apellidos;
    protected String sexo;
    protected String dni;
    protected String nacionalidad;
    protected Fecha fecha;
    protected float estatura;
    protected float peso;
    
    public Persona(String nombres, String apellidos, String sexo, String dni, String nacionalidad,int dia, int mes, int anio, float peso, float estatura) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.dni = dni;
        this.nacionalidad = nacionalidad;
        fecha = new Fecha(dia,mes,anio);
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public Persona() {
        this.nombres = " ";
        this.apellidos = " ";
        this.sexo = " ";
        this.dni = " ";
        this.nacionalidad = " ";
        fecha = new Fecha();
        this.estatura = 0;
        this.peso = 0;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public void setFechaDia(int dia){
        this.fecha.setDia(dia);
    }
    
    public void setFechaMes(int mes){
        this.fecha.setMes(mes);
    }
    
    public void setFechaAnio(int anio){
        this.fecha.setAnio(anio);
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getSexo() {
        return sexo;
    }

    public String getDni() {
        return dni;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public float getEstatura() {
        return estatura;
    }

    public float getPeso() {
        return peso;
    }
    
    public int getFechaDia(){
        return fecha.getDia();
    }
    
    public int getFechaMes(){
        return fecha.getMes();
    }
    
    public int getFechaAnio(){
        return fecha.getAnio();
    }
     
    
    @Override
    public void ingresarDatos(){
        System.out.print("Nombres: ");
        nombres = entrada.next().toUpperCase();
        System.out.print("Apellidos: ");
        apellidos = entrada.next().toUpperCase();
        System.out.print("Sexo: ");
        sexo = entrada.next().toUpperCase();
        System.out.print("Nacionalidad: ");
        nacionalidad = entrada.next().toUpperCase();
        System.out.print("Documento de identidad: ");
        dni = entrada.next().toUpperCase();
        System.out.print("Dia de nacimiento: ");
        setFechaDia(entrada.nextInt());
        System.out.print("Mes de nacimiento: ");
        setFechaMes(entrada.nextInt());
        System.out.print("Anio de nacimiento: ");
        setFechaAnio(entrada.nextInt());
        System.out.print("Peso: ");
        peso = entrada.nextFloat();
        System.out.print("Estatura: ");
        estatura = entrada.nextFloat();
    }
    
    @Override
    public void mostrarDatos(){
        System.out.println(dni + " - " + nombres + " " + apellidos + " - " + getFechaDia() + "/" + getFechaMes() + "/" + getFechaAnio());
        System.out.println(sexo + " - " + nacionalidad + " - " + peso + " - " + estatura);
    }
    
    public void mostrarDatos2(){
        System.out.println(dni + " - " + nombres + " " + apellidos + " - " + getFechaDia() + "/" + getFechaMes() + "/" + getFechaAnio());
        System.out.println(sexo + " - " + nacionalidad + " - " + peso + " - " + estatura);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s %s\n",dni,"-",nombres,apellidos);
    }
    
}
