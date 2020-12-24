package proyectofinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    Scanner entrada = new Scanner(System.in);
    private String cod_team;
    private String nom_Equipo;
    private ArrayList <Persona> team; //en un inicio no tiene jugadores
    private int cantTeam;

    public Equipo(String cod_team, String nom_Equipo) {
        this.cod_team = cod_team;
        this.nom_Equipo = nom_Equipo.toUpperCase();
        team = new ArrayList <Persona>();
        cantTeam = 0;
    }
        
    public Equipo(){
        team = new ArrayList <Persona>();
        cod_team = "001";
        nom_Equipo = " ";
        cantTeam = 0;
    }
    
    public int getCantJugadores(){
        return team.size();
    }
    
    public void setCod_team(String cod_team) {
        this.cod_team = cod_team;
    }

    public void setNom_Equipo(String nom_Equipo) {
        this.nom_Equipo = nom_Equipo.toUpperCase();
    }
    
    public String getCod_team() {
        return cod_team;
    }

    public String getNom_Equipo() {
        return nom_Equipo;
    }
    
    public void setMiembroEquipo(Persona persona){
        team.add(persona);
    }
    
    public void insertarJugador(Persona persona){
        
        Jugador it = (Jugador) persona;
        String cod = "0" + (team.size());
        String cadena = getCod_team() + cod.substring(cod.length()-2, cod.length());
        it.setCod_jugador(cadena);
        System.out.println("Posicion: ");
        it.setPosicion(entrada.next().toUpperCase());
        System.out.println("Dorsal: ");
        it.setDorsal(entrada.nextInt());
        
        team.add(it);
        cantTeam++;
    }
    
    public Persona getJugador(int index){
        return team.get(index);
    }
    
    public void ingresarDatosEquipo(){
        
        System.out.print("Ingrese nombre del equipo: ");
        setNom_Equipo(entrada.nextLine().toUpperCase());
        
        ingresarEntrenador();
    }
    
    private void ingresarEntrenador(){
        
        System.out.println("Datos del entrenador\n");
        
        Entrenador ent = new Entrenador();
        String cod = String.valueOf(cod_team) + "A";
        ent.setCod_entrenador(cod);
        ent.ingresarDatos();
        team.add(ent);
        cantTeam++;
    }
       
    public void ingresarJugadores(){
        String nombres,apellidos,sexo,dni,posicion,nacionalidad, rpta;
        int dia,mes,anio,dorsal;
        float peso,estatura;
        
        do{
            System.out.print("Nombres: ");
            nombres = entrada.next();
            System.out.print("Apellidos: ");
            apellidos = entrada.next();
            System.out.print("Sexo: ");
            sexo = entrada.next();
            System.out.print("Nacionalidad: ");
            nacionalidad = entrada.next();
            System.out.print("Documento de identidad: ");
            dni = entrada.next();
            System.out.print("Dia de nacimiento: ");
            dia = entrada.nextInt();
            System.out.print("Mes de nacimiento: ");
            mes = entrada.nextInt();
            System.out.print("Anio de nacimiento: ");
            anio = entrada.nextInt();
            System.out.print("Peso: ");
            peso = entrada.nextFloat();
            System.out.print("Estatura: ");
            estatura = entrada.nextFloat();
            System.out.print("Posicion de juego: ");
            posicion = entrada.next();
            System.out.print("Dorsal: ");
            dorsal = entrada.nextInt();
            
            Jugador it = new Jugador(nombres, apellidos, sexo, dni, nacionalidad, dia, mes, anio, peso, estatura, posicion, dorsal);
            team.add(it);
            
            System.out.print("Desea agregar un nuevo jugador [S/n]: ");
            rpta = entrada.next();
        }while(rpta.equalsIgnoreCase("S"));        
    }
    
    //eliminar
    public void establecerCodigoMiembrosTeam(){
        int j = 1;
        for(Persona i: team){
            if(i instanceof Jugador){
                Jugador j2 = (Jugador) i;
                String cod = String.valueOf(cod_team) + j;
                j++;
                
                j2.setCod_jugador(cod);                
            }
            else{
                Entrenador e2 = (Entrenador) i;
                String cod = String.valueOf(cod_team) + "A";
                e2.setCod_entrenador(cod);
            }
        }
    }
    
    public void mostrarDatos(){
        //establecerCodigoMiembrosTeam();
        System.out.println("\nDatos del Equipo:\n");
        System.out.println("Nombre del equipo: " + nom_Equipo);
        System.out.println("Codigo: " + cod_team);
        
        for(Persona i: team){
            if(i instanceof Entrenador){
                System.out.println("ENTRENADOR:");
                i.mostrarDatos();
                System.out.println("\nLISTA DE JUGADORES:\n");
            }
            else{
                i.mostrarDatos();
                System.out.println();
            }
        }
    }
    
    public int buscarJugador(String codigo){
        int pos = -1;
        
        for(int i=1; i<cantTeam; i++){
            Jugador it = (Jugador) team.get(i);
            if(it.getCod_jugador().equals(codigo)){
                pos = i;
            }
        }
        
        return pos;
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s\n",cod_team,"-", nom_Equipo);
    }
    
    
   /*
    public static void main(String[] args){
        Equipo newEquipo = new Equipo();
        newEquipo.ingresarDatosEquipo();
        
        System.out.println("////////");
        //newEquipo.setMiembroEquipo(new Entrenador("Pep", "Guardiola", "Msculino", "72361352", "Español", 18, 1, 1971, 80, (float) 1.85, 10));
        newEquipo.insertarJugador(new Jugador("Sergio", "Aguero", "Masculino", "14785236", "Argentino", 20, 10, 1985, 80, (float) 1.70));
        newEquipo.insertarJugador(new Jugador("Kevin", "De Bruyne", "Masculino", "14785237", "Belga", 28, 6, 1991, 90, (float) 1.90));
        //newEquipo.ingresarJugadores();
        //newEquipo.mostrarDatos();
        
        System.out.println(newEquipo.buscarJugador("19200034"));
        Jugador it = (Jugador) newEquipo.getJugador(2);
        System.out.println(it.getCod_jugador());
        System.out.println(newEquipo.getJugador(2));
    }  */
}
