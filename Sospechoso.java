public class Sospechoso
{
    protected String nombre;
    protected int edad;
    protected String cedula;
    protected String genero;
    protected String conexion;
    protected String coartada;
    protected String testimonio;
    protected String historial;
    protected String lugar;
    protected String caracteristicasFisicas;

    public Sospechoso(String nombre, int edad, String cedula, String genero, String conexion, String coartada, String testimonio, String historial, String lugar, String caracteristicasFisicas)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.cedula = cedula;
        this.genero = genero;
        this.conexion = conexion;
        this.coartada = coartada;
        this.testimonio = testimonio;
        this.historial = historial;
        this.lugar = lugar;
        this.caracteristicasFisicas = caracteristicasFisicas;
    }

    public void darTestimonio()
    {
        System.out.println(nombre + " dice: \"" + testimonio + "\"");
    }

    public void presentarCoartada()
    {
        System.out.println(nombre + " presenta coartada: " + coartada);
    }

    public String obtenerInfo()
    {
        return nombre + " | Edad: " + edad + " | Conexión: " + conexion
               + " | Lugar: " + lugar;
    }
}
