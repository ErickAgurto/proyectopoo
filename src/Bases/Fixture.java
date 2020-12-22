package Bases;
public class Fixture {
    private Partido[] matches;

    public Fixture(Partido[] matches) {
        this.matches = matches;
    }

    public Partido[] getMatches() {
        return matches;
    }

    public void setMatches(Partido[] matches) {
        this.matches = matches;
    }
    
}
