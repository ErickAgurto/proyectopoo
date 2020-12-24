package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class ListadoJugadores {
    Scanner entrada = new Scanner(System.in);
    private ArrayList<Persona> eq;
    private int cantJugadores;
    
    public ListadoJugadores(){
        eq = new ArrayList<Persona>();
        cantJugadores = 0;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }
    
    public void setJugadores(){
        String rpta;
        
        do{
            Persona it = new Jugador();
            it.ingresarDatos();
            eq.add(it);
            cantJugadores++;
            System.out.println("Desea Agregar un nuevo Jugador [s/n]: ");
            rpta = entrada.next();
        }while(rpta.equalsIgnoreCase("S"));
    }
    
    public void mostrarListaJugadores(){
        if(cantJugadores > 0){
            System.out.println("Lista de Jugadores registrados");
            for(Persona i: eq){
                System.out.printf("%s",i);
            }
        }
        else{
            System.out.println("Error, no existen Jugadores registrados.");
        }
    }
    
    public int validarCodigoJugador(String codigo){
        int pos = -1;
        
        for(int i=0; i<eq.size(); i++){
            if(eq.get(i).getDni().equals(codigo)){
                return i;
            }
        }
        
        return pos;
    }
    
    public Persona getJugador(int posicion){
        return eq.get(posicion);
    }
}
