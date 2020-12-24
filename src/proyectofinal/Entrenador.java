package proyectofinal;

public class Entrenador extends Persona{
    private int anio_experiencia;
    private String cod_entrenador;
    
    public Entrenador(String nombres, String apellidos, String sexo, String dni, String nacionalidad, int dia, int mes, int anio, float peso, float estatura, int anio_experiencia) {
        super(nombres, apellidos, sexo, dni, nacionalidad, dia, mes, anio, peso, estatura);
        this.anio_experiencia = anio_experiencia;
    }
    
    public Entrenador(){
        super();
        anio_experiencia = 0;
    }

    public int getAnio_experiencia() {
        return anio_experiencia;
    }

    public void setAnio_experiencia(int anio_experiencia) {
        this.anio_experiencia = anio_experiencia;
    }

    public String getCod_entrenador() {
        return cod_entrenador;
    }

    public void setCod_entrenador(String cod_entrenador) {
        this.cod_entrenador = cod_entrenador;
    }
        
    @Override
    public void ingresarDatos(){
        super.ingresarDatos();
        System.out.print("Anios de experiencia: ");
        setAnio_experiencia(entrada.nextInt());
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println(anio_experiencia);
        System.out.println("Codigo: " + cod_entrenador);
    }  
    
}
