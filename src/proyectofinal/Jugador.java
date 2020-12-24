package proyectofinal;

import java.util.Scanner;

public class Jugador extends Persona{
    Scanner entrada = new Scanner(System.in); 
    private String cod_jugador;
    private String posicion;
    private int dorsal;
    private boolean visibilidad;

    public Jugador(String nombres, String apellidos, String sexo, String dni, String nacionalidad, int dia, int mes, int anio, float peso, float estatura) {
        super(nombres, apellidos, sexo, dni, nacionalidad, dia, mes, anio, peso, estatura);
        visibilidad = true;
    }
    
    public Jugador(String nombres, String apellidos, String sexo, String dni, String nacionalidad, int dia, int mes, int anio, float peso, float estatura, String posicion, int dorsal) {
        super(nombres, apellidos, sexo, dni, nacionalidad, dia, mes, anio, peso, estatura);
        this.posicion = posicion;
        this.dorsal = dorsal;
        this.cod_jugador = "";
        visibilidad = true;
    }

    public Jugador(){
        super();
        posicion = " ";
        dorsal = 0;
        cod_jugador = "";
    }
    
    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setCod_jugador(String cod_jugador) {
        this.cod_jugador = cod_jugador;
    }

    public String getCod_jugador() {
        return cod_jugador;
    }
            
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(posicion + " - " + dorsal);
        System.out.println(cod_jugador);
    }   
    
    @Override
    public String toString() {
        return String.format(super.toString());
    }
    
    /*
     public static void main(String[] args){
        Jugador j1 = new Jugador("Andre", "Mujica", "Masculino", "72361352", "Peruana", 27, 1, 2001, 85, (float) 1.80, "Defensa", 4);
        
        Persona personas[] = new Persona[4];
        
        personas[0] = new Persona("Ricardo", "Del rosario", "Masculino", "19200034", "Peruana",27, 1, 2001, 90, (float) 1.85);
        personas[1] = new Persona("Andrea", "Ramos", "Femenino", "14523685", "Peruana", 22, 9, 2000, 50, (float) 1.60);
        personas[2] = j1;
        personas[3] = new Jugador("AAA", "BBB", "CCC", "14528574", "Peruana",14, 10, 2000, 85, (float) 1.90, "Delantero", 11);
        
        int j = 1;
        for(Persona i: personas){
            if(i instanceof Jugador){
                Jugador j2 = (Jugador) i;
                String cod = "1000" + j;
                j++;
                
                j2.setCod_jugador(cod);                
            }
        }
        
        for(Persona i: personas){
            i.mostrarDatos();
            System.out.println();
        }
        
    }*/
}
