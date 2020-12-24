package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class ProtoInterfazGrafica {
    //Esta Clase podria ser la clase torneo
    
    Scanner entrada = new Scanner(System.in);
    private LIstadoEquipos LE;
    private ListadoJugadores LJ;
    //private ArrayList<RelacionEquipoJugador> RE; //joto
    private ArrayList<Equipo> equipos; //mmm
    private ArrayList<Campeonato> campeonatos;
    private int cantJugador_Equipo;
    
    public ProtoInterfazGrafica(){
        LE = new LIstadoEquipos();
        LJ = new ListadoJugadores();
        //RE = new ArrayList<RelacionEquipoJugador>(); // choto
        equipos = new ArrayList<Equipo>();
        campeonatos = new ArrayList<Campeonato>();
        cantJugador_Equipo = 0;
    }
    
    public void ingresarListaEquipo(){
        LE.setEquipos();
    }
    
    public void mostrarListaEquipos(){
        LE.mostrarListaEquipos();
    }
    
    public void ingresarListaJugadores(){
        LJ.setJugadores();
    }
    
    public void mostrarListaJugadores(){
        LJ.mostrarListaJugadores();
    }
    
    private String ingresarCodigoEquipo(){
        String cadena;
        
        do{
            mostrarListaEquipos();
            System.out.print("Ingrese el codigo del equipo: ");
            cadena = entrada.next();
        }while(cadena.length() != 3);
        
        return cadena;
    }
    
    private String ingresarCodigoJugador(){
        String cadena;
        
        do{
            mostrarListaJugadores();
            System.out.print("Ingrese el dni del jugador: ");
            cadena = entrada.next();
        }while(cadena.length() != 8);
        
        return cadena;
    }
    
    public void insertarJugadorEquipo(){
        String cadena, cadena1, rpta;
        int posicion, posicion1;
        Boolean band;
        
        //Pedir codigo del campeonato
        //Buscar los equipos participantes en ese campeonato
        
        cadena = ingresarCodigoEquipo();
        posicion = LE.validarCodigoEquipo(cadena);
        
        if(posicion != -1){
            
            do{
                cadena1 = ingresarCodigoJugador();                
                posicion1 = LJ.validarCodigoJugador(cadena1);
                band = LE.ValidarJugadorEquipo(cadena1);
                
                
                if((band == false) && (posicion1 != -1)){
                    Persona per_it = LJ.getJugador(posicion1);
                    LE.getEquipo(posicion).insertarJugador(per_it);
                }
                else{
                    System.out.println("No existe el codigo del jugador en la base de datos");
                }
                                               
                System.out.print("Desea inscribir un nuevo jugador al equipo [s/n]: ");
                rpta = entrada.next();
            }while(rpta.equalsIgnoreCase("S"));
            
            cantJugador_Equipo++;
        }
        else{
            System.out.println("No existe el codigo del equipo en la base de datos.");
        }
    }
    
    public void mostrarListaEquipoftJugadores(){
        if(cantJugador_Equipo > 0){
            System.out.println("Lista general de equipos");
            for(int i=0; i<LE.getCantEquipos(); i++){
                LE.getEquipo(i).mostrarDatos();
            }
        }
        else{
            System.out.println("No existen equipos registrados.");
        }
    }
    
    public void crearCampeonato(){
        String rpta;
        
        do{
            Campeonato it = new Campeonato();
            String cod = "CAMP" + (campeonatos.size() + 1);
            it.setCodigo(cod);
            it.ingresarDatosCampeonato();
            campeonatos.add(it);
            
            System.out.print("Desea ingresar un nuevo campeonato [s/n]: ");
            rpta = entrada.next();
        }while(rpta.equalsIgnoreCase("S"));
    }
    
    private String ingresarCodigoCampeonato(){
        String cadena;
        
        do{
            for(Campeonato i: campeonatos){
                System.out.printf("%s",i);
            }
            
            System.out.print("\nCodigo del campeonato: ");
            cadena = entrada.next();
        }while(cadena.length() != 5);
        
        return cadena;
    }
    
    private int validarCodigoCampeonato(String cadena){
        int pos = -1;
        
        for(int i=0; i<campeonatos.size(); i++){
            if(campeonatos.get(i).getCodigo().equals(cadena)){
                pos = i;
            }
        }
        
        return pos;
    }
    
    public void inscribirEquiposEnCampeonato(){
        String cadena, rpta;
        int posicion1, posicion2;
        Boolean band;
        
        cadena = ingresarCodigoCampeonato();
        posicion1 = validarCodigoCampeonato(cadena);
        
        if(posicion1 != -1){
            do{
                cadena = ingresarCodigoEquipo();
                posicion2 = LE.validarCodigoEquipo(cadena);

                if(posicion2 != -1){
                    band = campeonatos.get(posicion1).validarEquipo(cadena);

                    if(band == false){
                        campeonatos.get(posicion1).insertarEquipos(LE.getEquipo(posicion2));
                    }
                    else{
                        System.out.println("El equipo ya esta registrado en el campeonato.");
                    }
                }
                else{
                    System.out.println("No existe el codigo del equipo en la base de datos.");
                }
                System.out.println("Desea ingresar un nuevo equipo al campeonato [S/N]: ");
                rpta = entrada.next();
            }while(rpta.equalsIgnoreCase("S"));
        }
        else{
            System.out.println("No existe el codigo del campeonato en la base de datos.");
        }
    }
    
    public void mostrarCampeonatos(){
        
        if(campeonatos.size() > 0){
            System.out.println("LISTA DE CAMPEONATOS REGISTRADOS\n");
            
            for(Campeonato i: campeonatos){
                i.mostrarEquiposParticipantes();
            }
        }
        else{
            System.out.println("No existen campeonatos registrados.");
        }
    }
    
    public int getOpcionMenu(){
        int opc;
        
        do{
            System.out.println("****************************************");
            System.out.println("*************PROTO INTERFAZ*************");
            System.out.println("*Crear campeonato...................[1]*");
            System.out.println("*Ingresar equipos...................[2]*");
            System.out.println("*Ingresar jugadores.................[3]*");
            System.out.println("*Inscribir Jugador en Equipo........[4]*");
            System.out.println("*Inscribir equipos en campeonato....[5]*");
            System.out.println("*Mostrar lista de equipos...........[6]*");            
            System.out.println("*Mostrar lista de jugadores.........[7]*");            
            System.out.println("*Mostrar equipos-Jugadores..........[8]*");
            System.out.println("*Mostrar campeonatos registrados....[9]*");
            System.out.println("*Salir..............................[10]*");
            System.out.println("****************************************");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
        }while(opc<1 || opc>10);
        
        return opc;
    }
    
    public void Menu(){
        int opcion;
        
        do{
            opcion = getOpcionMenu();
            
            switch(opcion){
                case 1: crearCampeonato();
                        break;
                case 2: ingresarListaEquipo();
                        break;
                case 3: ingresarListaJugadores();
                        break;
                case 4: insertarJugadorEquipo();
                        break;
                case 5: inscribirEquiposEnCampeonato();
                        break;
                case 6: mostrarListaEquipos();
                        break;
                case 7: mostrarListaJugadores();
                        break;
                case 8: mostrarListaEquipoftJugadores();
                        break;
                case 9: mostrarCampeonatos();
                        break;
            }
        }while(opcion !=10);        
    }

    public static void main(String args[]){
        ProtoInterfazGrafica M = new ProtoInterfazGrafica();
        M.Menu();
    }
    
}
