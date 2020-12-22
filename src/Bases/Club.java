package Bases;
public class Club {
    private String codClub;
    private String nomClub;
    private Presidente president;
    private Estadio stadium;
    private Equipo[] teams;

    public Club(String codClub, String nomClub, Presidente president, Estadio stadium, Equipo[] teams) {
        this.codClub = codClub;
        this.nomClub = nomClub;
        this.president = president;
        this.stadium = stadium;
        this.teams = teams;
    }

    public String getCodClub() {
        return codClub;
    }

    public String getNomClub() {
        return nomClub;
    }

    public Presidente getPresident() {
        return president;
    }

    public Estadio getStadium() {
        return stadium;
    }

    public Equipo[] getTeam() {
        return teams;
    }

    public void setCodClub(String codClub) {
        this.codClub = codClub;
    }

    public void setNomClub(String nomClub) {
        this.nomClub = nomClub;
    }

    public void setPresident(Presidente president) {
        this.president = president;
    }

    public void setStadium(Estadio stadium) {
        this.stadium = stadium;
    }

    public void setTeam(Equipo[] teams) {
        this.teams = teams;
    }
    
    
}
