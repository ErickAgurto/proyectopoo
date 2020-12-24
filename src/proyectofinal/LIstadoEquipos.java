package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class LIstadoEquipos {
    Scanner entrada = new Scanner(System.in);
    private ArrayList<Equipo> eq;
    private int cantEquipos;
    
    public LIstadoEquipos(){
        eq = new ArrayList<Equipo>();
        cantEquipos = 0;
    }

    public int getCantEquipos() {
        return cantEquipos;
    }
    
    public void setEquipos(){
        String rpta = null;
        
        do{
            Equipo it = new Equipo();
            String cadena = "00" + (cantEquipos + 1);
            it.setCod_team(cadena.substring(cadena.length()-3, cadena.length()));
            it.ingresarDatosEquipo();
            eq.add(it);
            cantEquipos++;
            System.out.println("Desea Agregar un nuevo Equipo [s/n]: ");
            rpta = entrada.next();
        }while(rpta.equalsIgnoreCase("S"));
    }
    
    public void mostrarListaEquipos(){
        if(cantEquipos > 0){
            System.out.println("Lista de Equipos registrados");
            for(Equipo i: eq){
                System.out.printf("%s",i);
            }
        }
        else{
            System.out.println("Error, no existen Equipos registrados.");
        }
    }
    
    public int validarCodigoEquipo(String codigo){
        int pos = -1;
        
        for(int i=0; i<eq.size(); i++){
            if(eq.get(i).getCod_team().equals(codigo)){
                return i;
            }
        }
        
        return pos;
    }
    
    public Equipo getEquipo(int posicion){
        return eq.get(posicion);
    }
    
    public Boolean ValidarJugadorEquipo(String codJugador){
        
        for(int i=0; i<eq.size(); i++){
            for(int j=1; j<eq.get(i).getCantJugadores(); j++){
                if(eq.get(i).getJugador(j).getDni().equals(codJugador)){
                    return true;
                }
            }
        }
        
        return false;
    }
}
