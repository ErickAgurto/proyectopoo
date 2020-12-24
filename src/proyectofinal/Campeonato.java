package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Campeonato {
    Scanner entrada = new Scanner(System.in);
    private String codigo;
    private String nombre;
    private Fecha inicio;
    private Fecha fin;
    private ArrayList<Equipo> equipos;
    

    public Campeonato(String nombre, int iniDia, int iniMes, int iniAnio, int finDia, int finMes, int finAnio) {
        this.nombre = nombre.toUpperCase();
        this.inicio = new Fecha(iniDia, iniMes, iniAnio);
        this.fin = new Fecha(finDia, finMes, finAnio);
        equipos = new ArrayList<Equipo>();
        codigo = "";
    }
    
    public Campeonato() {
        this.nombre = "";
        this.inicio = new Fecha();
        this.fin = new Fecha();
        equipos = new ArrayList<Equipo>();
        codigo = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setFechaInicioDia(int dia){
        this.inicio.setDia(dia);
    }
    
    public void setFechaInicioMes(int mes){
        this.inicio.setMes(mes);
    }
    
    public void setFechaInicioAnio(int anio){
        this.inicio.setAnio(anio);
    }
    
    public void setFechaFinDia(int dia){
        this.fin.setDia(dia);
    }
    
    public void setFechaFinMes(int mes){
        this.fin.setMes(mes);
    }
    
    public void setFechaFinAnio(int anio){
        this.fin.setAnio(anio);
    }
    
    public int getFechaInicioDia(){
        return inicio.getDia();
    }
    
    public int getFechaInicioMes(){
        return inicio.getMes();
    }
    
    public int getFechaInicioAnio(){
        return inicio.getAnio();
    }
    
    public int getFechaFinDia(){
        return fin.getDia();
    }
    
    public int getFechaFinMes(){
        return fin.getMes();
    }
    
    public int getFechaFinAnio(){
        return fin.getAnio();
    }

    public String getNombre() {
        return nombre;
    }
    
    public void ingresarDatosCampeonato(){
        System.out.print("Nombre del campeonato: ");
        setNombre(entrada.nextLine().toUpperCase());
        System.out.println("Fecha de inicio");
        System.out.print("Dia: ");
        setFechaInicioDia(entrada.nextInt());
        System.out.print("Mes: ");
        setFechaInicioMes(entrada.nextInt());
        System.out.print("Anio: ");
        setFechaInicioAnio(entrada.nextInt());
        System.out.println("Fecha de fin");
        System.out.print("Dia: ");
        setFechaFinDia(entrada.nextInt());
        System.out.print("Mes: ");
        setFechaFinMes(entrada.nextInt());
        System.out.print("Anio: ");
        setFechaFinAnio(entrada.nextInt());
    }
    
    public void insertarEquipos(Equipo eq){
        equipos.add(eq);
    }
    
    public void mostrarEquiposParticipantes(){
        System.out.println("CAMPEONATO: "+ getNombre() + 
                "\nFecha de inicio: "+ inicio.mostrarFecha() + 
                "\nFecha de fin: " + fin.mostrarFecha() + 
                "\n\nLista de equipos participantes");
        
        for(Equipo i: equipos){
            System.out.printf("%s",i);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", codigo, "-", nombre);
    }

    public Boolean validarEquipo(String cadena) {
        for(Equipo i: equipos){
            if(i.getCod_team().equals(cadena)){
                return true;
            }
        }
        
        return false;
    }

    /*
    public static void main(String[] args) {
        Campeonato cam = new Campeonato();
        cam.ingresarDatosCampeonato();
        cam.insertarEquipos(new Equipo("1001", "Universitario"));
        cam.insertarEquipos(new Equipo("1002", "xxxxxxxxxx"));
        cam.mostrarEquiposParticipantes();
    }
    */
}
