package Bases;
public class Partido {
    private String codPartido;
    private int golLocal;
    private int golVisitante;
    private Equipo local;
    private Equipo visitante;

    public Partido(String codPartido, int golLocal, int golVisitante, Equipo local, Equipo visitante) {
        this.codPartido = codPartido;
        this.golLocal = golLocal;
        this.golVisitante = golVisitante;
        this.local = local;
        this.visitante = visitante;
    }

    public String getCodPartido() {
        return codPartido;
    }

    public int getGolLocal() {
        return golLocal;
    }

    public int getGolVisitante() {
        return golVisitante;
    }

    public Equipo getLocal() {
        return local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setCodPartido(String codPartido) {
        this.codPartido = codPartido;
    }

    public void setGolLocal(int golLocal) {
        this.golLocal = golLocal;
    }

    public void setGolVisitante(int golVisitante) {
        this.golVisitante = golVisitante;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }
    
}
