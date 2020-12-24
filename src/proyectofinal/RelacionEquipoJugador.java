package proyectofinal;

//import java.util.ArrayList;
import java.util.Scanner;

public class RelacionEquipoJugador {
    Scanner entrada = new Scanner(System.in);
    private Equipo equipo;
    //private ArrayList<Jugador> J;
    private int cantJugadores;
    
    public RelacionEquipoJugador(){
        equipo = new Equipo();
        //J = new ArrayList<Jugador>();
        cantJugadores = 0;
    }

    public void setEquipo(Equipo equipo){
        this.equipo = equipo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public int getCantJugadores() {
        return cantJugadores;
    }
    
    public void setJugador(Persona persona){
        
        if(cantJugadores < 30){
            Jugador it = (Jugador) persona;
            String cod = "0" + (cantJugadores + 1);
            String cadena = equipo.getCod_team() + cod.substring(cod.length()-2, cod.length());
            it.setCod_jugador(cadena);
            System.out.println("Posicion: ");
            it.setPosicion(entrada.next());
            System.out.println("Dorsal: ");
            it.setDorsal(entrada.nextInt());
            
            equipo.insertarJugador(persona);
            //this.J.add(it);
            cantJugadores++;
        }
        else{
            System.out.println("Un equipo no puede tener mas de 30 jugadores");
        }
    }
    
    public Persona getJugador(int posicion){
        return equipo.getJugador(posicion);
    }
}
