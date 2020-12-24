package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Club {
    Scanner entrada = new Scanner(System.in);
    private String nombre;
    private String cod_Club;
    private Persona presidente;
    private Estadio estadio;
    private ArrayList<Equipo> equipos;

    public Club(String nombre, String cod_club) {
        this.nombre = nombre;
        this.cod_Club = cod_club;
        
        equipos = new ArrayList<Equipo>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCod_Club(String cod_Club) {
        this.cod_Club = cod_Club;
    }

    public void setPresidente(Persona presidente) {
        this.presidente = presidente;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    public String getCod_Club() {
        return cod_Club;
    }

    public Estadio getEstadio() {
        return estadio;
    }
    
    public void setEquipos(Equipo equipo){
        this.equipos.add(equipo);
    }
    
    public Equipo getEquipos(int index){
        return equipos.get(index);
    }
    
    public void ingresarDatos(){
        /*System.out.print("Nombre del club: ");
        nombre = entrada.nextLine();*/
        System.out.println("Datos del presidente");
        setPresidente(new Persona("AAAA", "BBBB", "MAsculino", "12457836", "Español", 10, 10, 1970, 80, (float) 1.90));
        System.out.println("Datos del estadio");
        setEstadio(new Estadio("Camp Nou", 90500));
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre Club: " + nombre + "\nCodigo: " + cod_Club);
        System.out.println("Datos del presidente:");
        presidente.mostrarDatos();
        System.out.println("Datos del estadio:");
        estadio.mostrarDato();
    }
    
    public static void main(String[] args){
        //Club club = new Club("F.C. Barcelona", "001", new Persona("AAAA", "BBBB", "MAsculino", "12457836", "Español", 10, 10, 1970, 80, (float) 1.90), new Estadio("Camp Nou", 90500));
        //Club club = new Club("F.C. Barcelona", "001");
        //club.ingresarDatos();
        //club.mostrarDatos();
        
        Persona it = new Jugador("AAAAA", "BBBBB", "Masculino", "72361352", "Peruano", 10, 10, 2000, 80, (float) 1.80);
        it.mostrarDatos2();
        System.out.println("");
        Jugador nuevo = (Jugador) it;
        nuevo.setPosicion("Defensa");
        nuevo.setDorsal(10);
        
        nuevo.mostrarDatos();
        System.out.println("");
        it.mostrarDatos();
    }
    
}
