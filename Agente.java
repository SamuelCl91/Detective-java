public class Agente
{
    protected int id;
    protected String nombre;
    protected String agencia;
    protected String rango;
    protected String experiencia;
    protected int edad;

    public Agente(int id, String nombre, String agencia, String rango, String experiencia, int edad)
    {
        this.id = id;
        this.nombre = nombre;
        this.agencia = agencia;
        this.rango = rango;
        this.experiencia = experiencia;
        this.edad = edad;
    }
    
    public void mostrarInfo()
    {
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Agencia: " + agencia);
        System.out.println("Rango: " + rango);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("Edad: " + edad);
    }
}
