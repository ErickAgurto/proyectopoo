package proyectofinal;

public class Estadio{
    private String nombre;
    private int aforo;

    public Estadio(String nombre, int aforo) {
        this.nombre = nombre;
        this.aforo = aforo;
    }
    
    public Estadio(){
        nombre = "";
        aforo = 0;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAforo() {
        return aforo;
    }
    
    //@Override
    public void ingresarDatos(){
        
    }
    
    //@Override
    public void mostrarDato(){
        System.out.println("Nombre estadio: " + nombre + "\nAforo: "+ aforo);
    }
}
