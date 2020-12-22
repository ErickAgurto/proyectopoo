package Bases;
public class Equipo {
    private String nombreEquipo;
    private String codEquipo;
    private Club club;
    private Entrenador manager;
    private Jugador[] players;

    public Equipo(String nombreEquipo, String codEquipo, Club club, Entrenador manager, Jugador[] players) {
        this.nombreEquipo = nombreEquipo;
        this.codEquipo = codEquipo;
        this.club = club;
        this.manager = manager;
        this.players = players;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public String getCodEquipo() {
        return codEquipo;
    }

    public Club getClub() {
        return club;
    }

    public Entrenador getManager() {
        return manager;
    }

    public Jugador[] getPlayers() {
        return players;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public void setManager(Entrenador manager) {
        this.manager = manager;
    }

    public void setPlayers(Jugador[] players) {
        this.players = players;
    }
    
    
}
